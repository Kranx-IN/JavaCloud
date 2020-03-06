package exception3;

import java.io.IOException;

class X {
	public static double calculate(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			throw new ArithmeticException("cant divide by zero");
		}
	}

	public static double calculate2(int num1, int num2) throws IOException {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			throw new IOException("cant divide by zero");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			double result = X.calculate2(num1, num2);
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println("number de barobar");
		}
		
	}
}
