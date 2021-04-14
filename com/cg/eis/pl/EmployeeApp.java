package com.cg.eis.pl;
import com.cg.eis.service.Service;

public class EmployeeApp {

	public static void main(String[] args) {
		Service s =new Service();
		s.getInformation();
		s.getInsuranceScheme();
		s.displayInformation();
	}

}


