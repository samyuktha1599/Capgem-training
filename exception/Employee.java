package com.cg.eis.exception;

public class Employee {
	
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(double salary) throws EmployeeException {
		if(salary>=3000)
		{
			this.salary = salary;
		}
		else
		{
			throw new EmployeeException("Cannot have salary below 3000");
		}
		
	}


	

}
