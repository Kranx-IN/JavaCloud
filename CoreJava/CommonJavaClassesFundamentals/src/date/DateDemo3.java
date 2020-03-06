package date;

import java.time.LocalDate;

public class DateDemo3 {
	public static void main(String[] args) {
	
		int day = 7;
		int month = 9;
		int year = 1998;
		
		LocalDate date = LocalDate.of(year, month, day);
		
		System.out.printf("%d/%d/%d \n",date.getDayOfMonth(),date.getMonthValue(),date.getYear());	
		System.out.printf("%d/%s/%d \n",date.getDayOfMonth(),date.getMonth(),date.getYear());
		
		System.out.println(date.getDayOfYear() + " " + date.getDayOfWeek());
	}
}