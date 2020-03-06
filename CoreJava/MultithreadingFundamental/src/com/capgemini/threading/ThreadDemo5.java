package com.capgemini.threading;

class Thread5 implements Runnable {
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
	}
}

public class ThreadDemo5 {
	public static void main(String[] args) {
		System.out.println("The name of current thread in main(): " + Thread.currentThread().getName());

		System.out.println("Before creating child thread.");

		Thread5 task1 = new Thread5(); // task

		Thread t1 = new Thread(task1); // worker
		Thread t2 = new Thread(task1); // worker

		t1.start();
		t2.start();

		System.out.println("After creating child thread.");
	}
}
