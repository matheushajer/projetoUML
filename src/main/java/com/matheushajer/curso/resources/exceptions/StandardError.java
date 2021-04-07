package com.matheushajer.curso.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private long timeStanp;
	
	public StandardError(Integer status, String msg, long timeStanp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStanp = timeStanp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getTimeStanp() {
		return timeStanp;
	}

	public void setTimeStanp(long timeStanp) {
		this.timeStanp = timeStanp;
	}
	
}
