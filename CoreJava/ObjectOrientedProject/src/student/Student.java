package student;

public class Student {
	private int studentId;
	private String name;
	private long contactNo;
	private String course;
	private double fees;

	Student(int studentId, String name, long contactNo, String course, double fees) {
		this.studentId = studentId;
		this.name = name;
		this.contactNo = contactNo;
		this.course = course;
		this.fees = fees;
	}
	
	public void showData() {
		System.out.println("student id: "+studentId);
		System.out.println("name: "+name);
		System.out.println("contact number: "+contactNo);
		System.out.println("course: "+course);
		System.out.println("fees: "+fees);
	}

	public double getFees() {
		return this.fees;
	}
	
}
