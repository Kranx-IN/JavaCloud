package com.capegemini.ui;

import java.util.Scanner;

import com.capegemini.model.Employee;
import com.capegemini.service.EmployeeService;
import com.capegemini.service.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		boolean flag = true;
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Find Employee");
			System.out.println("0. exit Application");
			System.out.println("Enter your choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the employee id: ");
				int empId = s.nextInt();
				System.out.println("Enter the employee name: ");
				String empName = s.next();
				System.out.println("Enter the employee salary");
				double empSalary = s.nextDouble();

				Employee emp = new Employee(empId, empName, empSalary);

				boolean result = service.addEmployee(emp);
				if (result)
					System.out.println("Employee Created successfully.");
				break;
			case 2:
				System.out.println("Enter the Employee id: ");
				empId = s.nextInt();
				Employee emp2 = service.findEmployeeById(empId);
				System.out.println(emp2);
				break;
			case 0:
				flag =  false;
			}

		} while (flag);
	}

}
