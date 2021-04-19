package com.cg.eis.exception;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Employee Salary");
		Scanner s=new Scanner(System.in);
		double salary=Double.parseDouble(s.nextLine());
		try {
			Employee emp=new Employee(salary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}
}
