package com.capgemini.lambda;

public class LamdaDemo2 {
	public static void main(String[] args) {		
		Max ref = new Max() {		
			@Override
			public int max(int num1, int num2) {
				return (num1>num2)?num1:num2;
			}
		};
		System.out.println("Max number: " +ref.max(24, 55));
	}
}
