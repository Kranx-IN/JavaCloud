package com.capgemini.dao;

import com.capgemini.model.Employee;

public interface EmployeeDao {
	public int createEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
}
