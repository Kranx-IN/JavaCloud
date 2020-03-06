package com.capgemini.lambda;

public class LamdaDemo3 {
	public static void main(String[] args) {
		Max lamda = (n1,n2) -> (n1>n2)?n1:n2;	//lamda expression
		System.out.println("Max number: " + lamda.max(24, 48));
	}
}
