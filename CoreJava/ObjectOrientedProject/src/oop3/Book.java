package oop3;

public class Book {
	// default access specifier allows others to access
	private String bookName;
	private String author;
	private double price;

	Book(String bookName, String author, double price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public void showBook() {
		System.out.println("Book Name: " + bookName);
		System.out.println("author Name: " + author);
		System.out.println("price: " + price);
	}
}
