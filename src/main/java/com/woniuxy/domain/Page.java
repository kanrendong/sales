package com.woniuxy.domain;

public class Page {
	private int page=1;//��ǰҳ
	private int rows=20;//һҳ����
	private int begin;//��������¼��ʼ
	
	
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
