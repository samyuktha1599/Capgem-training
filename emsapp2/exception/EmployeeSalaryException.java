package com.capg.emsapp2.exception;

public class EmployeeSalaryException extends Exception {
	
	private String message;

	public EmployeeSalaryException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeSalaryException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmployeeSalaryException message: "+ message;
	}
	

}
