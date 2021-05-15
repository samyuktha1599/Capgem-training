package com.capg.app.exception;

public class EmailException extends Exception {
	private String message;

	public EmailException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmailException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmailException: " + getMessage();
	}
	

}
