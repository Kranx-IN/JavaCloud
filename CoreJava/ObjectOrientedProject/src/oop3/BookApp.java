package oop3;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book("half gf","chten bgat",5.0);
		Book b2 = new Book("full gf","Abhishek Mishra",2.5);
		System.out.println("b1: "+b1+" b2: "+b2);
		b1.showBook();
		b2.showBook();
	}
}
