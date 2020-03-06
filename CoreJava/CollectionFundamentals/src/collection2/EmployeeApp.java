package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeApp {

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>();

		Employee emp1 = new Employee(1001, "Sonu", 50000);
		Employee emp2 = new Employee(1002, "abhi", 50005);
		Employee emp3 = new Employee(1003, "sid", 50006);
		Employee emp4 = new Employee(1003, "sid", 50006);
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
		Iterator<Employee> itr = set.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
	}

}
