package SirAssignment;

public class Rectangle extends Shape {
	private double length, breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double Area() {
		return length * breadth;
	}

}
