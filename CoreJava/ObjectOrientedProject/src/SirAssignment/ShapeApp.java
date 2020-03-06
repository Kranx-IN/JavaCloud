package SirAssignment;

import java.util.Scanner;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean choice = false;
		int option = 0;
		Shape s1;
		Scanner s = new Scanner(System.in);
		while (!choice) {
			System.out.println("Enter the choice:");
			System.out.println("1.Enter the radius of the circle");
			System.out.println("2.Enter the length and breadt of Rect");
			System.out.println("3.Quit");
			option = s.nextInt();

			if (option == 1) {
				double radius = s.nextDouble();
				s1 = new Circle(radius);
				System.out.println("Area: "+s1.Area());
			} else if (option == 2) {
				double length = s.nextDouble();
				double breadth = s.nextDouble();
				s1 = new Rectangle(length,breadth);
				System.out.println("Area: "+s1.Area());
			}else {
				System.out.println("get lost");
				break;
			}
			System.gc();
		}
		s.close();
	}

}
