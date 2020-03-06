package com.capgemini.service;

import com.capgemini.model.Employee;

public interface EmployeeService {
	boolean addEmployee(Employee employee);
	Employee findEmployeeById(int employeeId);
}
