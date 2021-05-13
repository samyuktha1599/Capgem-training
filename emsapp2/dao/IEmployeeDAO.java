package com.capg.emsapp2.dao;

import java.util.List;

import com.capg.emsapp2.beans.Employee;

public interface IEmployeeDAO {
	
	public boolean insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesBySalary(int range1,int range2);
	public Employee getEmployeeById(int id);

}
