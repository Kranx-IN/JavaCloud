package oop2;

public class Book {
	//default access specifier allows others to access
	 String bookName;
	 String author;
	 double price;
	
	public void showBook() {
		System.out.println("Book Name: "+bookName);
		System.out.println("author Name: "+author);
		System.out.println("price: "+price);
	}
}
