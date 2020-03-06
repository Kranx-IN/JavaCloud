package lab2.exercise4;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private long phoneNumber;
	Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void setValues(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void setNumber() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the phone number: ");
		this.phoneNumber = s.nextLong();
	}
	
	public void showDetails() {
		System.out.println("Person Details");
		System.out.println("---------------");
		System.out.println("First Name: " + firstName);
		System.out.println("last Name: " + lastName);
		System.out.println("Gender : " + gender);
		System.out.println("phoneNumber: " + phoneNumber);

	}
}
