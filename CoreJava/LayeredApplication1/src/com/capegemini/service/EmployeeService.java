package com.capegemini.service;

import com.capegemini.model.Employee;

public interface EmployeeService {
	boolean addEmployee(Employee employee);

	Employee findEmployeeById(int employeeId);
}
