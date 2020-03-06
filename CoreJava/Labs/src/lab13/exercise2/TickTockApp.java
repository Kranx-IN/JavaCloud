package lab13.exercise2;

public class TickTockApp {

	public static void main(String[] args) {
		TickTock timer = new TickTock();
		Thread t1 = new Thread(timer);
		t1.start();
	}

}
