package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.*;


public class Service implements EmployeeService{
	Employee emp=new Employee();
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		emp.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Employee Name:");
		emp.setName(sc.nextLine());
		System.out.println("Enter Employee Salary:");
		emp.setSalary(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Employee Designation:");
		emp.setDesignation(sc.nextLine());

	}
				

	@Override
	public void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println("Employee details are as follows");
		System.out.println("Employee ID: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Salary: "+emp.getSalary());
		System.out.println("Employee Designation: "+emp.getDesignation());
		System.out.println("Employee Insurance Scheme: "+emp.getInsuranceScheme());
		
	}

	@Override
	public void getInsuranceScheme() {
		// TODO Auto-generated method stub
		if(emp.getDesignation().equals("Tester") || emp.getSalary()<40000)
		{
			emp.setInsuranceScheme("Monthly");
		}
		else if(emp.getDesignation().equals("Team Leader") || emp.getSalary()>75000)
		{
			emp.setInsuranceScheme("Yearly");
		}
		else
		{
			emp.setInsuranceScheme("Monthly");
		}
		
	}


	


	

}
