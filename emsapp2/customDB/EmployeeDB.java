package com.capg.emsapp2.customDB;

import java.util.ArrayList;
import java.util.List;

import com.capg.emsapp2.beans.Employee;
import com.capg.emsapp2.beans.Project;

public class EmployeeDB {
	
public static List<Employee> empList = new ArrayList<Employee>();
	
	static
	{
		Project p1=new Project(1,"ICICI-Bank");
		Employee e1 = new Employee("mike",101,3,2000,"ICICI-Bank",p1);
		Project p2=new Project(2,"ICICI-Bank");
		Employee e2 = new Employee("suresh",102,4,2000,"ICICI-Bank",p2);
		Project p3=new Project(1,"ICICI-Bank");
		Employee e3 = new Employee("Ramesh",102,1,3000,"HDFC-Bank",p3);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
	}
	
	public static boolean addEmployee(Employee e)
	{
	   return empList.add(e);	
	}

}
