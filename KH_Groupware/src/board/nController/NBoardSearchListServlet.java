package board.nController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.service.NBoardService;
import board.model.vo.PageInfo;
import member.model.vo.Member;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/NSlist.bo")
public class NBoardSearchListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NBoardSearchListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Member loginUser = (Member)session.getAttribute("loginUser");
		int cid= loginUser.getcId();
		System.out.println("서치서블릿cid: " +cid);
		
		String type= "";
		String searchWord="";
		if((request.getParameter("type")!=null)&&(request.getParameter("searchWord")!=null)) {
			type = request.getParameter("type");
			searchWord= request.getParameter("searchWord");
		}
		
		System.out.println("서블릿단 type: " + type);
		System.out.println("서블릿단 searchWord: " + searchWord);

		NBoardService bService= new NBoardService(); 
		
		// 게시판 리스트 갯수 구하기
		int listCount = bService.getListCount(cid,type, searchWord);
		System.out.println("써치 게시글 수: "+ listCount);
		

		//------페이징 처리 추가------------
		// 페이지 수 처리용 변수 선언 
		int currentPage; 	// 현재 페이지를 표시할 변수 
		int limit; 			// 한 페이지에 게시글이 몇개가 보여질지와  한 페이지에서  처리가능한 페이지 수 
		int maxPage; 		//전체 페이지에서 가장 마지막 페이지 
		int startPage;		// 한번에 표시될 페이지가 시작할 페이지 
		int endPage; 		// 한번에 표시될 페이지가 끝나는 페이지 
		
		// ex) 총 123개의 글이 잇다면..
		//	<<1 2 3 4 5 6 7 8 9 10> 이후에도 페이지가 더 있어야 한다. 
		//	<<11 12 13>				<--여기에서 11이 startPage, 13이 endPage, 13이 maxPage
		
	
		// * currentPage - 현재 페이지 
		// 기본 게시판 1  페이지부터 시작함 
		currentPage = 1;  	//1페이지를 default로 가져가자 
		//하지만, 페이지 전환시 전달받으 현재 페이지가 있을 시 해당 페이지를 currentPage로 적용
		
		if(request.getParameter("currentPage")!=null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		//* limit - 한 페이지에 보여질 목록 갯수 
		limit =10; 
		
		//* maxPage- 총 페이지 수 
		// 목록수가 123개이면 13페이지가 마지막 페이지다. 
		// 짜투리 목록이 최소 1개일때, 한 page로써 의미를 갖게 하기 위해서 0.9를 더 해주자
		maxPage=(int)((double)listCount/limit+0.9); 
		
		
		//* startPage - 현재 페이지에 시작 페이지수  
		// 아래쪽에 페이지수가 10개씩 보여지게 할 경우   1
					
		startPage=(((int)((double)currentPage/limit+0.9))-1)*limit+1; 
	
		//*endPage - 현재 페이지에서 보여질 마지막 페이지 수 
		// 아래쪽 페이지 수가 10개씩 보여지게 할 경우
		// 10, 20, 30, 40 
		endPage= startPage + limit -1; //19 
		
		// 하지만 !!! 마지막 페이지 수가 총 페이지 수보다 클 경우 
		// maxPage가 13이고 endPage가 20페이지일 경우 
		
		if(maxPage<endPage) {
			endPage= maxPage;
		}	
		// 위에서 계산된 모든 페이지 관련 변수들을 request에 담아서 보내야 될텐데 너무 많다!
	   // 그래서 페이지 정보를 공유할 vo 객체 PageInfo를 만들러가자! (page정보만 지닌 객체를 만들어서 넘기기 위해) 
		
		PageInfo pi = new PageInfo(currentPage,listCount,limit,maxPage,startPage,endPage);
		
		// 게시판 리스트 조회해 오기 
		System.out.println("서블릿 함수 파라미터: "+ cid + " " +type +" "+  searchWord + " " + currentPage+ " " + limit);
		ArrayList<Board> list= bService.selectList(cid, type, searchWord,currentPage,limit); 
		
		System.out.println("서블릿 searchlist: "+list);
		
		
		ArrayList<Attachment>flist = bService.selectAttachments(list);
		
		
		
		
		
		
		RequestDispatcher view = null;
		if(list!=null) {
				view = request.getRequestDispatcher("views/board/nBoardListView.jsp");
				request.setAttribute("list", list); // 현재 페이지 화면에 뿌려질 게시글이 담긴 객체 
				request.setAttribute("pi", pi);		// 페이지관련된 정보가 담긴객체 
				request.setAttribute("flist",flist);
			
		}else {
			view = request.getRequestDispatcher("views/common/errorPage.jsp");
			request.setAttribute("msg", "게시판 리스트 조회 실패!");
		}
		
		view.forward(request, response);
		
		//boardListView.jsp페이지 만들러 ㄱㄱ씽 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
