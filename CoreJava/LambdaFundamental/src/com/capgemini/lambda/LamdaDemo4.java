package com.capgemini.lambda;

public class LamdaDemo4 {
	public static void main(String[] args) {
		/*Display lamda1 = () -> System.out.println("Displaying lamda1");
		lamda1.display();*/
		
		Display lamda1 = (String msg) -> System.out.println("Message from lamda1: " + msg);
		lamda1.display("Hello world!");
		
		Max lamda2 = (n1,n2) -> (n1>n2)?n1:n2;
		System.out.println("Lamda 2: " + lamda2.max(24, 55));
		
		Max lamda3 = (n1,n2) -> {
			if(n1 > n2) 
				return n1;
			else
				return n2;
			};
		System.out.println("Lamda 3: " + lamda3.max(999, 445));
		
	}
}