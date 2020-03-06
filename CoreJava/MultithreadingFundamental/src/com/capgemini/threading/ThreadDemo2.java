package com.capgemini.threading;

class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("The name of current thread in run(): "
				+ Thread.currentThread().getName());
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("The name of current thread in main(): "
				+ Thread.currentThread().getName());	
		
		System.out.println("Before creating child thread.");
		Thread2 t=  new Thread2();
		//t.run();
		t.start();
		System.out.println("After creating child thread");
	}

}
