package student;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student(1234,"Shailesh Singh",809781027,"Java",50000);
		Student s2 = new Student(1235,"Siddarth Singh",809781026,"Devops",40000);
		s1.showData();
		s2.showData();
		double TotalFees = s1.getFees()+s2.getFees();
		System.out.println("total fees: "+TotalFees);
	}

}
