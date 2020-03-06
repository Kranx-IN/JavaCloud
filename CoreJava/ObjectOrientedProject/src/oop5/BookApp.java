package oop5;

public class BookApp {
	public static void main(String[] args) {
		// Book.setDiscount(10);
		Book b1 = new Book("book 1", "me", 500);
		Book b2 = new Book("book 2", "not me", 250);
		System.out.println("b1: " + b1 + " b2: " + b2);
		b1.showBook();
		b2.showBook();
	}
}
