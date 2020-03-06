package lab3.exercise3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDuration {

	public static void main(String[] args) {
		String date;
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();

		System.out.println("Enter the date: ");
		date = sc.nextLine();

		int year = Integer.parseInt(date.substring(6, 10));
		int day = Integer.parseInt(date.substring(0, 2));
		int month = Integer.parseInt(date.substring(3, 5));

		int sysYear = cal.get(Calendar.YEAR);
		int sysDay = cal.get(Calendar.DATE);
		int sysMonth = cal.get(Calendar.MONTH) + 1;

		int totalYears = sysYear - year;
		System.out.println("number of years: " + totalYears);

		int totalMonths;
		if (month < sysMonth)
			totalMonths = sysMonth - month + totalYears * 12;
		else
			totalMonths = month - sysMonth + totalYears * 12;

		System.out.println("number of months: " + totalMonths);

		int leapDays = (int) (totalYears / 4);
		// System.out.println("number of days: " + leapDays);

		if (month <= 2)
			leapDays++;
		if (sysMonth > 2 && sysMonth % 4 == 0)
			leapDays++;

		// System.out.println("number of days: " + leapDays);
		int totalDays = totalYears * 365 + leapDays;
		if(totalYears==0)
			totalDays = totalMonths * 365 + leapDays;
		System.out.println("total days: " + totalDays);

		sc.close();
	}

}
