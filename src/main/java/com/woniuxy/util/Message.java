package com.woniuxy.util;

public class Message {
	private boolean success;
	private String msg;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Message() {
		super();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Message(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}
}
