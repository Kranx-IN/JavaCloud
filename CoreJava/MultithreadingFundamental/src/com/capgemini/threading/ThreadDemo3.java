package com.capgemini.threading;

class Thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("The name of current thread in run(): "
				 + Thread.currentThread().getName());
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		System.out.println("The name of current thread in main(): "
				+ Thread.currentThread().getName());

		System.out.println("Before creating child thread.");
		
		Thread3 task = new Thread3(); //task
		Thread t1 = new Thread(task);	//worker
		t1.start();
		
		System.out.println("After creating child thread");
	}
}
