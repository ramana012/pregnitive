package com.sun.restservice.entity;

public class ResponseEntity {

	int status;
	String message;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseEntity [status=" + status + ", message=" + message + "]";
	}
	

	
}
