package com.capgemini.lambda;

public class LamdaDemo1 implements Max{
	
	public static void main(String[] args) {
		Max ref = new LamdaDemo1();
		System.out.println("Max number: " + ref.max(155, 988));		
	}

	@Override
	public int max(int num1, int num2) {
		return (num1 > num2)?num1:num2;
	}
}