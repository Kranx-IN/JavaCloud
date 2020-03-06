package collection3;

import java.util.TreeSet;
import java.util.Iterator;

public class EmployeeApp{

	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<Employee>();

		Employee emp1 = new Employee(1001, "Sonu", 50000);
		Employee emp2 = new Employee(1002, "abhi", 50005);
		Employee emp3 = new Employee(1003, "sid", 50006);
		Employee emp4 = new Employee(1003, "sid", 50006);
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
		for(Employee e: set) {
			System.out.println(e);
		}
	}

	

}
