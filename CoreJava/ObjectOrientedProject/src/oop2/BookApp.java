package oop2;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookName = "Java fundamentals-1";
		b1.author = "Cay Horstman";
		b1.price = 550.0;
		b1.showBook();
	}
}
