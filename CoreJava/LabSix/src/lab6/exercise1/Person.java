package lab6.exercise1;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;

	Person() {

	}

	Person(String firstName, String lastName, char gender) {
		try {
			if (firstName.equals("") && lastName.equals(""))
				throw new FieldBlankException();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
		} catch (FieldBlankException e) {
			e.printStackTrace();
		} finally {
			if (firstName != "")
				this.firstName = firstName;
			if (lastName != "")
				this.lastName = lastName;
			if (gender != ' ')
				this.gender = gender;
		}
	}

	public void setValues(String firstName, String lastName, char gender) {
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
	}
	
	
}
