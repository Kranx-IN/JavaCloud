package lab6.exercise1;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;

	Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void setValues(String firstName, String lastName, char gender) {
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
	}

	public void showDetails() {
		System.out.println("Person Details");
		System.out.println("---------------");
		System.out.println("First Name: " + getFirstName());
		System.out.println("last Name: " + getLastName());
		System.out.println("Gender : " + getGender());

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
	
	
}
