package thumbnail.model.vo;

import java.io.Serializable;

public class PageInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1771993122764469601L;
	private int currentPage;
	private int listCount;
	private int limit;
	private int maxPage;
	private int startPage;
	private int endPage;
	
	// 기본생성자
	public PageInfo() {
	}
	
	
	public PageInfo(int currentPage, int listCount, int limit, int maxPage, int startPage, int endPage) {
		this.currentPage = currentPage;
		this.listCount = listCount;
		this.limit = limit;
		this.maxPage = maxPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}


	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getListCount() {
		return listCount;
	}
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "PageInfo [currentPage=" + currentPage + ", listCount=" + listCount + ", limit=" + limit + ", maxPage="
				+ maxPage + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	
	
}


