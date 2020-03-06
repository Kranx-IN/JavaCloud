package com.capgemini.threading;

class Thread6 implements Runnable {
	// private int count = 0;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("The name of current thread in run(): " + name);
		int count = 0;

		for (int i = 0; i <= 5; i++) {
			count++;
			System.out.println(name + ": " + count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("State of main: " + ThreadDemo6.main.getState());
	}
}

public class ThreadDemo6 {

	public static Thread main = null;

	public static void main(String[] args) {
		main = Thread.currentThread();

		System.out.println("The name of current thread in main(): " + Thread.currentThread().getName());

		System.out.println("Before creating child thread.");

		Thread6 task1 = new Thread6(); // task

		Thread t1 = new Thread(task1); // worker
		Thread t2 = new Thread(task1); // worker
		t1.setName("First");
		t2.setName("Second");

		t1.setPriority(10);
		t2.setPriority(5);

		t1.start();
		t2.start();

		try {
			t1.join(5000);
			t2.join(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("After creating child thread.");
		
	}
}
