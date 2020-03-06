package com.capgemini.threading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Thread example: " + name);
	}

}
