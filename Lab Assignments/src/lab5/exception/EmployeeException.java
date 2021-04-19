package com.cg.eis.exception;

public class EmployeeException extends Exception {
	
	private String message;

	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee Salary Exception: "+message;
	}
	

}
