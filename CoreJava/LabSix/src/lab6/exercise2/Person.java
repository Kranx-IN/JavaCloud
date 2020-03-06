package lab6.exercise2;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(int age) throws UnderAgeException{
			if(age<15)
				throw new UnderAgeException(age);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + " age: " + age;
	}
}
