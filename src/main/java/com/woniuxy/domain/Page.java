package com.woniuxy.domain;

public class Page {
	private int page=1;//当前页
	private int rows=20;//一页几条
	private int begin;//从那条记录开始
	
	
	public int getBegin() {
		return (page-1)*rows;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
