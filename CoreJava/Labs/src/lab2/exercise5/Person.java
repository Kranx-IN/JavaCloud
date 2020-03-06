package lab2.exercise5;

import java.util.Scanner;

public class Person {
	
	enum Gender{
		M,F,N
	}
	private String firstName;
	private String lastName;
	private Gender gender;
	private long phoneNumber;
	Person(String firstName, String lastName, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void setValues(String firstName, String lastName, Gender gender) {
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
