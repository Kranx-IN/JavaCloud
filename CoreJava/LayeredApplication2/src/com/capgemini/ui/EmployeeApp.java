package com.capgemini.ui;

import java.time.LocalDate;
import java.util.IllegalFormatException;
import java.util.Scanner;

import com.capgemini.model.Employee;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		boolean flag = true;
		do {
			System.out.println("..Select an option..");
			System.out.println("1. Add Employee");
			System.out.println("2. Find Employee");
			System.out.println("0. exit Application");
			System.out.println("Enter your choice");
			String choice = s.nextLine();
			switch (choice) {
			case "1":
				boolean flag2 = true;
				System.out.println("Enter the employee id: ");
				int empId = s.nextInt();
				System.out.println("Enter the employee name: ");
				String empName = s.next();
				System.out.println("Enter the employee salary");
				double empSalary = s.nextDouble();
				System.out.println("Enter department id");
				int deptId = s.nextInt();
				s.nextLine();
				System.out.println("Enter date of joining (dd-mm-yyyy)");
				String date = s.next();
				String[] dateVal = date.split("-");
				LocalDate doj = null;
				try {
					doj = LocalDate.of(Integer.parseInt(dateVal[2]), Integer.parseInt(dateVal[1]), Integer.parseInt(dateVal[0]));
				}catch(NumberFormatException e) {
					System.out.println(e.getMessage());
				}
				Employee emp = new Employee(empId, empName, empSalary, deptId, doj);

				boolean result = service.addEmployee(emp);
				if (result)
					System.out.println("Employee Created successfully.");
				break;
			case "2":
				System.out.println("Enter the Employee id: ");
				empId = s.nextInt();
				Employee emp2 = service.findEmployeeById(empId);
				System.out.println(emp2);
				break;
			case "0":
				flag =  false;
				System.out.println("Terminating....");
				break;
			default:
				System.out.println("\n\tInvalid input\n");
			}

		} while (flag);
		System.out.println("Program Terminated");
	}

}
