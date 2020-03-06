package date;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo4 {
	public static void main(String[] args) {
	
		int day = 7;
		int month = 9;
		int year = 1998;
		
		LocalDate dob = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(dob, today);
		System.out.printf("'%s' is %d years %d months %d days ahead of '%s' \n",today,period.getYears(),period.getMonths(),period.getDays(),dob);
		
		System.out.printf("Years between %s and %s is = %d \n",dob,today,period.getYears());
		System.out.printf("Months between %s and %s is = %d \n",dob,today,period.getMonths());
		System.out.printf("Days between %s and %s is = %d \n",dob,today,period.getDays());
		
	}
}