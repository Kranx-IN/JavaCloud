package lab6.exercise2;

public class UnderAgeException extends Exception {
	int age;
	public UnderAgeException() {
		
	}

	public UnderAgeException(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "You are under age: "+age;
	}
}
