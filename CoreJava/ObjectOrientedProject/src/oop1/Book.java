package oop1;

public class Book {
	 private String bookName;
	 private String author;
	 private double price;
	
	public void showBook() {
		System.out.println("Book Name: "+bookName);
		System.out.println("author Name: "+author);
		System.out.println("price: "+price);
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookName = "Java fundamentals-1";
		b1.author = "Cay Horstman";
		b1.price = 550.0;
		b1.showBook();
	}
}
