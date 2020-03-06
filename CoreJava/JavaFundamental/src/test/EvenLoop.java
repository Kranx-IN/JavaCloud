package test;

public class EvenLoop {
	public static void main(String[] args) {
		System.out.println("even numbers from 0 to 10.");
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
