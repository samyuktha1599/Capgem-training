package com.capg.emsapp2.service;

import java.util.List;

import com.capg.emsapp2.beans.Employee;
import com.capg.emsapp2.exception.EmployeeSalaryException;

public interface IEmployeeService {
	
	public boolean insertEmployee(Employee e)throws EmployeeSalaryException;
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesBySalary(int range1,int range2);
	public Employee getEmployeeById(int id);

}
