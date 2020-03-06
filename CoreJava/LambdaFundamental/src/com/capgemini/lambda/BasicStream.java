package com.capgemini.lambda;

import java.util.ArrayList;
import java.util.List;

public class BasicStream {
	public static void main(String[] args) {
		
		List<String> list  = new ArrayList<String>();
		list.add("Capgemini");
		list.add("Infosys");
		list.add("Wipro");
		list.add("TCS");
		list.add("Cognizant");
		
		list.stream().forEach(s -> System.out.println(s));	
		System.out.println("----------------------------------------------------");
		
		list.stream()
			.filter(s -> (s.length()>5))
			.forEach(s -> System.out.println(s));
		System.out.println("----------------------------------------------------");
		
		list.stream()
			.filter(com -> (com.length()>5))
			.map(com -> com.length())
			.forEach(len -> System.out.println(len));
	}
}