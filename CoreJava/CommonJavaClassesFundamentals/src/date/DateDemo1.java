package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Time: " + sdf.format(date));
		
	}
}