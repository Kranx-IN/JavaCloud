package collection4;

import java.util.Comparator;

public class EmployeeIdSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmployeeId() == o2.getEmployeeId()) {
			return 0;
		} else if (o1.getEmployeeId() >= o2.getEmployeeId()) {
			return 1;
		} else {
			return -1;
		}
	}
}
