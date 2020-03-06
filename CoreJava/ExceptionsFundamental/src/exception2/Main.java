package exception2;

public class Main {

	public static void main(String[] args) {

		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			double div = num1 / num2;
			System.out.println("division: " + div);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Program expect two int args. plz pass them.");
		} catch (ArithmeticException e) {
			System.out.println("cant divide by zero.");
		} catch (NumberFormatException e) {
			System.out.println("Number barobar daal.");
		} finally {
			System.out.println("Closing of resources");
		}
	}

}
