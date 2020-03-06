package oop6;

class A {
	public A() {
		System.out.println("mai A() hoon");
	}
}

class B extends A {
	public B() {
		System.out.println("mai B() hoon");
	}
}

public class Main {
	public static void main(String[] args) {
		B obj = new B();
	}
}
