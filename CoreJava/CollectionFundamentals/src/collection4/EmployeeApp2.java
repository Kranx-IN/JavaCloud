package collection4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeApp2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		Employee emp1 = new Employee(1001, "Sonu", 50000);
		Employee emp2 = new Employee(1002, "abhi", 50005);
		Employee emp3 = new Employee(1003, "sid", 50006);
		Employee emp4 = new Employee(1003, "sid", 50006);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Collections.sort(list, (o1,o2) -> {	
			if (o1.getEmployeeSalary() == o2.getEmployeeSalary()) {
				return 0;
			} else if (o1.getEmployeeSalary() >= o2.getEmployeeSalary()) {
				return -1;
			} else {
				return 1;
			}} );
		
		System.out.println(list);
	}

}
