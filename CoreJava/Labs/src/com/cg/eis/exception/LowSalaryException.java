package com.cg.eis.exception;

public class LowSalaryException extends Exception {
	double salary;

	public LowSalaryException() {

	}

	public LowSalaryException(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Low salary value= " + salary ;
	}
	
	
}
