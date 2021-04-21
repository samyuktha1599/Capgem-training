package com.eis.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.eis.bean.Employee;
import com.eis.service.EmployeeServiceImpl;

public class MainUI {
	
static Scanner sc = new Scanner(System.in);
	
	static EmployeeServiceImpl empService = new EmployeeServiceImpl();
	static Employee emp = new  Employee();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainUI obj = new MainUI();
		
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Enter employee"+"\n"+"2. Display employees"+"\n"+"3. Display Insurance Scheme"+"\n"+"0. Exit");
			int n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1: 
				obj.insertEmp();
				break;
			case 2:
				obj.displayEmployees();
				break;
			case 3:
				obj.employeeInsuranceScheme();
				break;
			case 0:
				System.exit(0);
				
			}
			
		}

	}
	
	public static void insertEmp() {
		System.out.println("Enter Employee ID:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Designation:");
		String designation = sc.nextLine();
		empService.insertEmployee(new Employee(id, name, salary, designation));
		
		
		
	}
	
	public void displayEmployees()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployees();
		
		iterateEmployeeList(empList);
		
			}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(" Name : "+e.getName());
		System.out.println(" ID : "+e.getId());
		System.out.println(" Salary : "+e.getSalary());
		System.out.println(" Designation : "+e.getDesignation());
		System.out.println(" Insurance Scheme : "+e.getInsuranceScheme());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	
	
	public void employeeInsuranceScheme() {
		System.out.println("Enter insurance scheme");
		String insurance = sc.nextLine();
		List<Employee> empList = empService.getAllEmployeesByInsurance(insurance);
		iterateEmployeeList(empList);
		
		
	}
	
	public void iterateEmployeeList(List<Employee> empList) {
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}

		
	}

}
