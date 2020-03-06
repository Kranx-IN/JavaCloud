package oop5;

public class Book {
	// default access specifier allows others to access
	private String bookName;
	private String author;
	private double price;
	private static double discount;

	// static blocks are used for initializing static members of a class
	static {
		Book.discount = 50;
	}

	Book(String bookName, String author, double price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public static void setDiscount(double discount) {
		Book.discount = discount;
	}

	public double calcDiscount(double price, double discount) {
		double realPrice = price - (0.01 * discount * price);
		return realPrice;
	}

	public void showBook() {
		System.out.println("Book Name: " + bookName);
		System.out.println("author Name: " + author);
		System.out.println("price: " + price);
		System.out.println("discount: " + Book.discount);
		System.out.println("real Price: " + calcDiscount(this.price, Book.discount));
	}
}
