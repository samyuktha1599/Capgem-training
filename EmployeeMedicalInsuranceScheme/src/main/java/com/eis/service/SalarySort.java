package com.eis.service;

import java.util.Comparator;

import com.eis.bean.Employee;

public class SalarySort implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary()-o2.getSalary();
	}

}
