package com.eis.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	List<Employee> empList = new ArrayList<Employee>();

	public boolean insertEmployee(Employee e) throws Exception  {
		if(e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary() >= 40000 && e.getDesignation().equals("Manager")) {
			e.setInsuranceScheme("Scheme A");
		}
		else if(e.getSalary() <= 5000 && e.getDesignation().equals("Clerk")) {
			e.setInsuranceScheme("No Scheme");
		}
		else
		{
			throw new Exception("Designation is not valid..." );
		}
		boolean x = empList.add(e);
		return x;
	}

	public List<Employee> getAllEmployees() {
	
		return empList;
	}

	public List<Employee> getAllEmployeesByInsurance(String insurance) {
		List<Employee> temp = new ArrayList<Employee>();
		for(Employee e : empList) {
			if(e.getInsuranceScheme().equals(insurance)) {
				temp.add(e);
			}
 		}
		return temp;
	}

	public List<Employee> deleteEmployee(int id, String name) {
		for(Employee e : empList) {
			if(e.getId() == id && e.getName().equals(name)) {
				empList.remove(e);
			}
		}
		return empList;
	}


	
	

	



	

}
