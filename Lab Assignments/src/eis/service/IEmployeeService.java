package com.eis.service;

import java.util.HashMap;
import java.util.List;

import com.eis.bean.Employee;

public interface IEmployeeService {
	
	public boolean insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByInsurance(String insurance);
	public List<Employee> deleteEmployee(int id, String name);
	
	
	

}
