/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-23 08:50:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import java.util.ArrayList;
import member.model.vo.khClass;

public final class memberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("member.model.vo.khClass");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	Member loginUser = (Member)request.getAttribute("member");
	khClass cls = (khClass)request.getAttribute("khClass");

	
	String userId = loginUser.getUserId();
	String cName = cls.getcName();
	String userName = loginUser.getUserName();
	String userBorn = loginUser.getRRN().substring(0, 7);
	String userGender = loginUser.getRRN().substring(6);
		if(userGender.equals("1")){
			userGender = "남";
		}else{
			userGender = "여";
		}
	String[] email = loginUser.geteMail().split("@");
	String[] phone = loginUser.getPhone().split("-");
	String[] address = loginUser.getAddress().split("@");
	
	
	
	


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/bPopup/0.11.0/jquery.bpopup.js'></script>\r\n");
      out.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/bPopup/0.11.0/jquery.bpopup.min.js'></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.outer{\r\n");
      out.write("\t\t/* border: 2px solid black; */ \r\n");
      out.write("\t\twidth : 90%;\r\n");
      out.write("\t\theight : 500px;\r\n");
      out.write("\t\tbackground : white;\r\n");
      out.write("\t\tcolor : black;\r\n");
      out.write("\t\tmargin-left : 5%;\r\n");
      out.write("\t\tmargin-right : 5%;\r\n");
      out.write("\t\tmargin-top : 3%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.outer label, .outer td{\r\n");
      out.write("\t\tcolor : black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#joinForm{\r\n");
      out.write("\t\tmargin-top: 40px;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tinput{\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\tmargin-top : 20px;\r\n");
      out.write("\t\twidth: 400px;\r\n");
      out.write("\t\theight: 40px;\r\n");
      out.write("\t\tmargin-left: 60px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#deleteBtn, #updateBtn, #joinBtn, #searchAdd{\r\n");
      out.write("\t\tbackground : black;\r\n");
      out.write("\t\tcolor : white;\r\n");
      out.write("\t\tborder-radius : 5px;\r\n");
      out.write("\t\twidth : 150px;\r\n");
      out.write("\t\theight : 40px;\r\n");
      out.write("\t\ttext-align : center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#searchAdd{\r\n");
      out.write("\t\talign-content: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\tmargin-top: 20px;\r\n");
      out.write("\t\tfont-size: 22px;\r\n");
      out.write("\t\ttext-align : right;\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tselect{\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\theight: 40px;\r\n");
      out.write("\t\twidth: 400px;\r\n");
      out.write("\t\tmargin-left: 200px;\r\n");
      out.write("\t\tmargin-top: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#joinForm tr{\r\n");
      out.write("\t\tmargin-bottom: 40px;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t#goMain{\r\n");
      out.write("\t\tbackground : white;\r\n");
      out.write("\t\tcolor : black;\r\n");
      out.write("\t\tborder-radius : 5px;\r\n");
      out.write("\t\twidth : 150px;\r\n");
      out.write("\t\theight : 40px;\r\n");
      out.write("\t\ttext-align : center;\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#updateBtn, #goMain, #deleteBtn{\r\n");
      out.write("\t\tdisplay : inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.btns{\r\n");
      out.write("\t\tmargin: 15px;\r\n");
      out.write("\t\tmargin-top:50px;\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\tpadding: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#idCheckPop{\r\n");
      out.write("\t\twidth:\t500px;\r\n");
      out.write("\t\theight: 200px; \r\n");
      out.write("\t\tdisplay: none;\r\n");
      out.write("\t\tbackground: white;\r\n");
      out.write("\t\tpadding: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tth{\r\n");
      out.write("\t\tmax-width: 200px;\r\n");
      out.write("\t\theight: 20px;\r\n");
      out.write("\t\ttext-align: right;\r\n");
      out.write("\t\tpadding-left: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t\r\n");
      out.write("</header>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- menubar.jsp를 찾아서 그 페이지를 내 페이지에 include(포함)시켜라 // 페이지에서 사용한 스크립트,css 모두다 가져옴-->\r\n");
      out.write("\r\n");
      out.write("<div class = \"outer\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<h1 align=\"left\" style=\"font-size : 50px;\"><em>정보수정</em></h1>\r\n");
      out.write("\t\t<h3>");
      out.print( userName );
      out.write(' ');
      out.write('(');
      out.print(userBorn );
      out.write(',');
      out.write(' ');
      out.print(userGender );
      out.write(")</h3> \r\n");
      out.write("\t\t<h4>");
      out.print(cName );
      out.write("반</h4>\r\n");
      out.write("\t\t<form id = \"updateForm\" action = \"");
      out.print(request.getContextPath() );
      out.write("/update.me\" method =\"post\" >\r\n");
      out.write("\t\t\t<table align = \"center\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width =\"200px\"> * 아이디 </td>\r\n");
      out.write("\t\t\t\t\t<td><input id = \"userId\" type = \"text\" maxlength =\"13\" name = \"userId\" value = \"");
      out.print(userId);
      out.write("\"readonly=\"readonly\"></td>  <!--required 미입력시 값을 입력하세요 문구뜸  -->\r\n");
      out.write("\t\t\t\t\t<th class = \"info\"><div id = \"checkId\" class = \"checkInfo\"></div></th>\r\n");
      out.write("\t\t\t\t\t<!-- <td width =\"200px\"><div id=\"idCheck\" class = \"btns\"\">중복확인</div></td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td> * 비밀번호 </td>\r\n");
      out.write("\t\t\t\t\t<td><input id = \"userPwd\" type =\"password\" maxlength=\"20\" name =\"userPwd\" required></td>\r\n");
      out.write("\t\t\t\t\t<th class = \"info\"><div id = \"checkPwd\" class = \"checkInfo\"></div></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>* 비밀번호 확인</td>\r\n");
      out.write("\t\t\t\t\t<td><input id = \"userPwd2\" type=\"password\" maxlength=\"20\" name=\"userPwd2\" required></td>\r\n");
      out.write("\t\t\t\t\t<th class = \"info\"><div id = \"checkPwd2\" class = \"checkInfo\"></div></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td> * 연락처 </td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id = \"tel0\" class = \"phone\" name = \"phone1\" value = \"");
      out.print(phone[0]);
      out.write("\"style=\"width: 90px; margin-left: 10px; height: 48px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value = \"010\">010</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value = \"011\">011</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value = \"016\">016</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value = \"019\">019</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<input id = \"tel1\" class = \"phone\" type=\"tel\" value = \"");
      out.print(phone[1]);
      out.write("\"maxlength=\"4\" name=\"phone2\" style=\"width: 130px;  margin-left: 15px;\">\r\n");
      out.write("\t\t\t\t\t\t<input id = \"tel2\" class = \"phone\" type=\"tel\" value = \"");
      out.print(phone[2]);
      out.write("\"maxlength=\"4\" name=\"phone3\" style=\"width: 130px;  margin-left: 15px;\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<th class = \"info\"><div id = \"checkPhone\" class = \"checkInfo\"></div></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td> * 이메일 </td>\r\n");
      out.write("\t\t\t\t\t<td id = \"emailPt\"><input type = \"text\" name = \"emailId\" value = \"");
      out.print(email[0]);
      out.write("\"style=\"width: 141px; margin-right: 5px;\" required=\"required\"><em>@</em>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"email2\" value = \"");
      out.print(email[1]);
      out.write("\" style=\"width: 220px; margin-left: 0px;\" ReadOnly=\"true\" placeholder = \"naver.com\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t<select id = \"selctEmail\" name = \"selctEmail\" class = \"info\" style=\"width: 150px; margin-left: 0px; height: 40px;\" onchange=\"SetEmailTail(selctEmail.options[this.selectedIndex].value)\" >\r\n");
      out.write("\t\t\t\t\t\t<!-- <option value = \"notSelected\">====선택====</option> -->\r\n");
      out.write("\t\t\t\t\t\t<option value = \"naver.com\">naver.com</option> \r\n");
      out.write("\t\t\t\t\t\t<option value = \"goole.com\">google.com</option>\r\n");
      out.write("\t\t\t\t\t\t<option value = \"hanmail.net\">hanmail.net</option>\r\n");
      out.write("\t\t\t\t\t\t<option value = \"yahoo.com\">yahoo.com</option>\r\n");
      out.write("\t\t\t\t\t\t<option value = \"korea.com\">nate.com</option>\r\n");
      out.write("\t\t\t\t\t\t<option value = \"hotmail.com\">hotmail.com</option>\r\n");
      out.write("\t\t\t\t\t\t<option value = \"daum.net\">daum.net</option>\r\n");
      out.write("\t\t\t\t\t\t<option value = \"etc\">직접입력</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td> * 주소 </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"address\" name = \"address\" value = \"");
      out.print(address[0]);
      out.write("\"placeholder=\"주소\" ReadOnly = \"true\" required=\"required\"></td>\r\n");
      out.write("\t\t\t\t\t<th><input type=\"button\" id = \"searchAdd\" class = \"info\" onclick=\"execDaumPostcode()\" value=\"우편번호 찾기\" style = \"margin-left: 0px\"></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"detailAddress\" value = \"");
      out.print(address[1]);
      out.write("\"name = \"detailAdd\" placeholder=\"상세주소\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align = \"center\">\r\n");
      out.write("\t\t\t\t<div id = \"updateBtn\" class = \"btns\"onclick =\"updateMember();\">수정하기</div>\r\n");
      out.write("\t\t\t\t<div id = \"deleteBtn\" class = \"btns\"onclick = \"deleteMember();\">탈퇴하기</div>\r\n");
      out.write("\t\t\t\t<div id = \"goMain\" class = \"btns\"onclick =\"goMain();\">메인으로</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 중복체크 팝업창 -->\r\n");
      out.write("\t<div id = \"idCheckPop\">\r\n");
      out.write("\t\t\t<h1>test</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\tfunction SetEmailTail(emailValue) {\r\n");
      out.write("\t\t  var email = document.all(\"email\")    // 사용자 입력\r\n");
      out.write("\t\t  var emailTail = document.all(\"email2\") // Select box\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  if ( emailValue == \"notSelected\" )\r\n");
      out.write("\t\t   return;\r\n");
      out.write("\t\t  else if ( emailValue == \"etc\" ) {\r\n");
      out.write("\t\t   emailTail.placeholder = \"\";\r\n");
      out.write("\t\t   emailTail.readOnly = false;\r\n");
      out.write("\t\t   emailTail.value = \"\";\r\n");
      out.write("\t\t   emailTail.focus();\r\n");
      out.write("\t\t  } else {\r\n");
      out.write("\t\t   emailTail.readOnly = true;\r\n");
      out.write("\t\t   emailTail.value = emailValue;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t }\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tpwdCheck = false;\r\n");
      out.write("\t\tpwdCheck2 = false;\r\n");
      out.write("\t\tphoneCheck = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#userPwd\").keyup(function() {\r\n");
      out.write("\t\t\tvar userPwd = $(\"#userPwd\").val();\r\n");
      out.write("\t\t\tvar pwdRe = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,25}$/;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (userPwd == \"\") {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd\").text(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t\tpwdCheck = false;\r\n");
      out.write("\t\t\t} else if (!pwdRe.test(userPwd)) {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd\").text(\"문자,숫자,특수문자를 포함한 8-20자\");\r\n");
      out.write("\t\t\t\tpwdCheck = false;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd\").css(\"color\", \"blue\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").css(\"border\", \"3px solid blue\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd\").text(\"사용가능한 비밀번호입니다.\");\r\n");
      out.write("\t\t\t\tpwdCheck = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#userPwd2\").keyup(function() {\r\n");
      out.write("\t\t\tvar userPwd2 = $(\"#userPwd2\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($(\"#userPwd1\") == \"\") {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").text(\"비밀번호를 먼저 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").val(\"\");\r\n");
      out.write("\t\t\t\tpwdCheck2 = false;\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\t\t\t} else if (pwdCheck == false) {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").text(\"비밀번호 조건을 먼저 만족시켜야합니다.\");\r\n");
      out.write("\t\t\t\tpwdCheck2 = false;\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\t\t\t} else if ($(\"#userPwd\").val() != userPwd2) {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").text(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t\t\tpwdCheck2 = false;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").css(\"color\", \"blue\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").css(\"border\", \"3px solid blue\");\r\n");
      out.write("\t\t\t\t$(\"#checkPwd2\").text(\"비밀번호가 일치합니다.\");\r\n");
      out.write("\t\t\t\tpwdCheck2 = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t$(\".phone\").keyup(function() {\r\n");
      out.write("\t\t\tvar phoneRe1 = /^[0-9]{3,4}$/;\r\n");
      out.write("\t\t\tvar phoneRe2 = /^[0-9]{4}$/;\r\n");
      out.write("\t\t\tvar tel1 = $(\"#tel1\").val();\r\n");
      out.write("\t\t\tvar tel2 = $(\"#tel2\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (tel1 == \"\"  && tel2 == \"\" ) {\r\n");
      out.write("\t\t\t\t$(\"#checkPhone\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#tel1\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#tel2\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#checkPhone\").text(\"번호을 입력하세요.\");\r\n");
      out.write("\t\t\t\tphoneCheck = false;\r\n");
      out.write("\t\t\t} else if (!phoneRe1.test(tel1) || !phoneRe2.test(tel2) ) {\r\n");
      out.write("\t\t\t\t$(\"#checkPhone\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t$(\"#tel1\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#tel2\").css(\"border\", \"3px solid red\");\r\n");
      out.write("\t\t\t\t$(\"#checkPhone\").text(\"3~4자의 숫자\");\r\n");
      out.write("\t\t\t\tphoneCheck = false;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#checkPhone\").css(\"color\", \"blue\");\r\n");
      out.write("\t\t\t\t$(\"#tel0\").css(\"border\", \"3px solid blue\");\r\n");
      out.write("\t\t\t\t$(\"#tel1\").css(\"border\", \"3px solid blue\");\r\n");
      out.write("\t\t\t\t$(\"#tel2\").css(\"border\", \"3px solid blue\");\r\n");
      out.write("\t\t\t\t$(\"#checkPhone\").text(\"유효한 전화번호입니다.\");\r\n");
      out.write("\t\t\t\tphoneCheck = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 정보수정\r\n");
      out.write("\t\tfunction updateMember(){\r\n");
      out.write("\t\t\tif(pwdCheck  == false){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 확인해주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\t\t\t}else if(pwdCheck2  == false){\r\n");
      out.write("\t\t\t\talert(\"비밀번호 일치여부를 확인해주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd2\").focus();\r\n");
      out.write("\t\t\t}else if(phoneCheck  == false){\r\n");
      out.write("\t\t\t\talert(\"전화번호를 확인해주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#tel1\").focus();\r\n");
      out.write("\t\t\t}else if($(\"#emailId\").val() == \"\"){\r\n");
      out.write("\t\t\t\talert(\"이메일을 입력해주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#emailId\").focus();\r\n");
      out.write("\t\t\t}else if($(\"#address\").val() == \"\"){\r\n");
      out.write("\t\t\t\talert(\"주소를 입력해주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#emailId\").focus();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tif(!confirm(\"정말로 정보를 수정하시겠습니까 ?\")){\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t$(\"#updateForm\").submit();\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t// 메인으로 이동 함수\r\n");
      out.write("\tfunction goMain() {\r\n");
      out.write("\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".btns\").hover(function() {\r\n");
      out.write("\t\t  $(this).css({\"cursor\": \"pointer\"});\r\n");
      out.write("\t\t}, function(){\r\n");
      out.write("\t\t //$(this).css({\"background\":\"black\"})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t// 회원 탈퇴하기 \r\n");
      out.write("\tfunction deleteMember(){\r\n");
      out.write("\t\tvar bool = confirm(\"정말로 탈퇴하시겠습니까?\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(bool){\r\n");
      out.write("\t\t\t//form태그의 경로를 바꿔줌 attr(속성값변경) \r\n");
      out.write("\t\t\t$(\"#updateForm\").attr(\"action\", \"");
      out.print(request.getContextPath() );
      out.write("/delete.me\");\r\n");
      out.write("\t\t\t$(\"#updateForm\").submit();\r\n");
      out.write("\t\t\t// DeleteMemberServlet 만들러 !!\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("    function execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var addr = ''; // 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    addr = data.roadAddress;\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    addr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                    if(extraAddr !== ''){\r\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                    document.getElementById(\"address\").value = '';\r\n");
      out.write("                \r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"address\").value = '';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("               \r\n");
      out.write("                document.getElementById(\"address\").value = addr+\"  (\"+data.zonecode+\")\";\r\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                document.getElementById(\"detailAddress\").focus();\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
