package com.capg.emsapp2.ui;


import java.util.List;
import java.util.Scanner;

import com.capg.emsapp2.beans.Employee;
import com.capg.emsapp2.beans.Project;
import com.capg.emsapp2.service.EmployeeServiceImpl;
import com.capg.emsapp2.service.IEmployeeService;

public class MainUIClass {
	
	Scanner sc;
	IEmployeeService empService;
	
	public MainUIClass() {
		empService = new EmployeeServiceImpl();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		MainUIClass obj = new MainUIClass();
		int value=0;
		
		do {
			System.out.println("1. To Add Employee");
			System.out.println("2. To Display All Employees Information");
			System.out.println("3. To Display Employee By Salary");
			System.out.println("4. To Display Employee By ID");
			int option=Integer.parseInt(obj.sc.nextLine());
			switch(option)
			{
			case 1:
				obj.insertEmployeeInforamtion();
				break;
			case 2:
				obj.displayAllEmployee();
				break;
			case 3:
				System.out.println("Enter Salary Range:");
				int range1=Integer.parseInt(obj.sc.nextLine());
				int range2=Integer.parseInt(obj.sc.nextLine());
				obj.getAllEmployeesBySalary(range1, range2);
				break;
			case 4:
				System.out.println("Enter ID:");
				int id=Integer.parseInt(obj.sc.nextLine());
				obj.getEmployeeByID(id);
				break;
			
			}
			System.out.println("Enter non zero value to continue:");
			 value=Integer.parseInt(obj.sc.nextLine());
			 
		}while(value!=0);
		
	}
	
	public void insertEmployeeInforamtion()
	{
		System.out.println(" \n Enter Employee Informations \n");
		System.out.println(" Enter Employee Name ");
		String empName = sc.nextLine();
		
		System.out.println(" Enter Employee Id ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Employee Experience ");
		int experience = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Employee Salary ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Project  Name ");
		String projectName = sc.nextLine();
		
		System.out.println(" Enter Project ID ");
		int pid = Integer.parseInt(sc.nextLine());
		
		Project project=new Project(id, projectName);
		
		Employee e = new Employee(empName, id,experience, salary, projectName,project);
		
		try
		{
			boolean isInserted = empService.insertEmployee(e);
			
			// -----
		}
		catch(Exception excep)
		{
			
			System.out.println(excep);
		}
		
		
	}
	
	public void displayAllEmployee()
	{
		System.out.println("\n=========== Employees Information ===========\n");
		List<Employee> empList = empService.getAllEmployees();
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(" Name "+e.getEmpName());
		System.out.println(" ID "+e.getId());
		System.out.println("Experience "+e.getExperience());
		System.out.println(" Salary "+e.getSalary());
		System.out.println("Project "+e.getProject());
		System.out.println("\n---------------------------------------------\n");
		
		
	}
	
	public void getAllEmployeesBySalary(int range1,int range2)
	{ System.out.println("---------------Employee information by Salary--------------");
		List<Employee> empSalaryList=empService.getAllEmployeesBySalary(range1, range2);
		for (Employee employee : empSalaryList) {
			displayEmployee(employee);
		}
	}
	
	public void getEmployeeByID(int id)
	{
		System.out.println("------------ Employee information by ID-----------");
		displayEmployee(empService.getEmployeeById(id));
	}

}
