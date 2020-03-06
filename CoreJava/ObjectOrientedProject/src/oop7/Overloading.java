package oop7;

public class Overloading {

	public void display() {
		System.out.println("Display method me no paramter");
	}

	public void display(int x) {
		System.out.println("Display method me paramter: " + x);
	}

	public void display(float x) {
		System.out.println("Display method me paramter: " + x);
	}
	//differnt return types and access specifiers don't work with overloading
	public static void main(String[] args) {
		Overloading m = new Overloading();
		m.display();
		m.display(10);
		m.display(5.9f);
	}

}
