package lab3.exercise2;

import java.util.Scanner;

public class PostiveString {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		s = sc.nextLine();
		boolean positiveString = isPositiveString(s);
		if(positiveString) {
			System.out.println(s+" is a positive string.");
		}else {
			System.out.println(s+" is a not positive string.");
		}
		sc.close();
	}

	private static boolean isPositiveString(String s) {
		boolean result = false;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) > s.charAt(i - 1)) {
				result = true;
			} else {
				return false;
			}
		}
		return result;
	}
}
