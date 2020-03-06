package vehicle;

public class VehicleApp {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(1234, "honda", 500000, 10);
		Vehicle v2 = new Vehicle(1235, "wagon R", 600000, 15);
		v1.display();
		v2.display(); 
		if (v1.getPrice() < v2.getPrice()) {
			System.out.println("lowest is: v1");
		} else {
			System.out.println("lowest is: v2");
		}
		if (v1.getMileage() > v2.getMileage()) {
			System.out.println("highest is: v1");
		} else {
			System.out.println("highest is: v2");
		}

	}
}
