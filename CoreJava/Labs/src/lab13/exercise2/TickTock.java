package lab13.exercise2;


import java.util.Calendar;


public class TickTock implements Runnable {

	@Override
	public void run() {

		// SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		while (true) {
			Calendar cal = Calendar.getInstance();

			System.out.println(cal.getTime());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
