package com.capegemini.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.capegemini.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	// in-memory database
	private static Set<Employee> employeeDB = new HashSet<>();

	@Override
	public boolean addEmployee(Employee employee) {
		boolean result = employeeDB.add(employee);
		return result;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		Employee emp = null;
		Iterator<Employee> itr = employeeDB.iterator();  //we need new object of iterator when we want to traverse over the set
		while(itr.hasNext()) {
			emp = itr.next();
			if(emp.getEmployeeId() == employeeId) {
				return emp;
			}
		}
		return null;
	}

}
