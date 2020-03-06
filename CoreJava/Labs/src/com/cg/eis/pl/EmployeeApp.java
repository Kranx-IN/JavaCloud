package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.LowSalaryException;
import com.cg.eis.service.Service;

public class EmployeeApp {

	public static void main(String[] args) {
		Service se = new Service();

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = s.nextInt();
		System.out.println("Enter the salary:");
		double salary = s.nextDouble();
		
		s.nextLine();
		System.out.println("Enter the name:");
		String name = s.nextLine();
		System.out.println("Enter the designation:");
		String designation = s.nextLine();
		try {
		Employee e = new Employee(id,name,salary,designation);
		se.generateScheme(e);
		System.out.println(e);
		}catch(LowSalaryException e) {
			System.out.println(e);
		}
		
	}
}
