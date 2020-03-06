package com.cg.eis.bean;

import com.cg.eis.exception.LowSalaryException;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;

	public Employee() {

	}

	public Employee(int id, String name, double salary, String designation) throws LowSalaryException{
		super();
		this.id = id;
		this.name = name;
		if (salary < 3000) {
			throw new LowSalaryException(salary);
		}
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
		System.out.println(this.insuranceScheme);
	}

	@Override
	public String toString() {
		return "name: " + name + " id:" + id + " salary: " + salary + "\n designation:" + designation + " insurance:"
				+ insuranceScheme;
	}
}
