package com.capgemini.model;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private int departmentId;
	private LocalDate employeeDOJ;

	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public LocalDate getEmployeeDOJ() {
		return employeeDOJ;
	}
	public void setEmployeeDOJ(LocalDate employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}
	public Employee() {

	}
	public Employee(int employeeId, String employeeName, double employeeSalary,int departmentId,LocalDate employeeDOJ) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.departmentId = departmentId;
		this.employeeDOJ = employeeDOJ;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}	
	@Override
	public String toString() {
		return "Employee [employeeId= " + employeeId + ", employeeName= " + employeeName + ", employeeSalary= "
				+ employeeSalary + ", departmentId= " + departmentId + ", employeeDOJ= " + employeeDOJ + "]";
	}
}
