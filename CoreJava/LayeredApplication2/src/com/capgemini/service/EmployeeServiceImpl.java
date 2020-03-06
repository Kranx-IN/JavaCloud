package com.capgemini.service;

import com.capgemini.dao.EmployeeDao;
import com.capgemini.dao.EmployeeDaoImpl;
import com.capgemini.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public boolean addEmployee(Employee employee) {
		int result = dao.createEmployee(employee);
		if(result >= 1){
			return true;
		}
		return false;
	}
	@Override
	public Employee findEmployeeById(int employeeId) { 
		return dao.getEmployeeById(employeeId);
	}
}