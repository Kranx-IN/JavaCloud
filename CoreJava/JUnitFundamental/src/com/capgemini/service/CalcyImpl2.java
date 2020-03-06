package com.capgemini.service;

public class CalcyImpl2 {

	public long sub(int num1,int num2) {
		if(num1 < 0 || num2 <0) {
			throw new IllegalArgumentException();
		}		
		return num1-num2;
	}
}
