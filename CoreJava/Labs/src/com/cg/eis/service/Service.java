package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeScheme {
	private String scheme;

	@Override
	public void generateScheme( Employee e) {
		double salary = e.getSalary();
		String designation = e.getDesignation();
		if (salary <= 5000 && designation.equals("Clerk")) {
			e.setInsuranceScheme("No Scheme");
		} else if (salary < 20000 && designation.equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		} else if (salary < 40000 && designation.equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		} else {
			e.setInsuranceScheme("Scheme A");
		}
	}

}
