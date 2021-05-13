package com.eis.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.eis.bean.Employee;

public class EmployeeServiceImplTest {
	List<Employee> list=new ArrayList<Employee>();

	

	@Test
	public void testInsertEmployee() {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		Employee e=new Employee(101,"Sam", 25000,"Programmer");
		boolean actual=true;
		try {
			actual = service.insertEmployee(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assertEquals(true, actual);
	}
	
	public void testGetAllEmployee() {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		Employee e1=new Employee(101,"Sam", 25000,"Programmer");
		Employee e2=new Employee(102,"ABC", 45000,"Manager");
		list.add(e1);
		list.add(e1);
		List<Employee> actual=service.getAllEmployees();
		assertEquals(list, actual);
		
	}

}
