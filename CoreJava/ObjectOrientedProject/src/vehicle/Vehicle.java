package vehicle;

public class Vehicle {
	private int regno;
	private String brand;
	private double price;
	private int mileage;

	Vehicle(int regno, String brand, double price, int mileage) {
		this.regno = regno;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}
	public void display() {
		System.out.println("registration number: "+regno);
		System.out.println("brand: "+brand);
		System.out.println("price: "+price);
		System.out.println("mileage: "+mileage);
		System.out.println("--------------");
	}
	public double getPrice() {
		return price;
	}
	public double getMileage() {
		return mileage;
	}
	
}
