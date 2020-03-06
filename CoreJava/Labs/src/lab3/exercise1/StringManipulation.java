package lab3.exercise1;

import java.util.LinkedHashSet;
import java.util.Scanner;

//3.1: Create a method which can perform a particular String operation 
//based on the user’s choice.
//The method should accept the String object and 
//the user’s choice and return the output of the
//operation.
//Options are
//1. Add the String to itself
//2. Replace odd positions with #
//3. Remove duplicate characters in the String
//4. Change odd characters to upper case

public class StringManipulation {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		sb.append(sc.nextLine());
		System.out.println("Enter your choice: ");
		System.out.println("1. Add the String to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String");
		System.out.println("4. Change odd characters to upper case");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			sb = sb.append(sb);
			break;
		case 2:
			for (int i = 1; i < sb.length(); i = i + 2) {
				sb.deleteCharAt(i);
				sb.insert(i, "#");
			}
			break;
		case 3:
			LinkedHashSet<Character> temp = new LinkedHashSet<Character>();
			for (int i = 0; i < sb.length(); i++) {
				temp.add(sb.charAt(i));
			}
			sb.delete(0, sb.length());
			for (char i : temp) {
				sb.append(i);
			}
			break;
		case 4:
			for (int i = 1; i < sb.length(); i = i + 2) {
				int ascii = (int) sb.charAt(i);
				if (ascii > 96 && ascii < 123) {
					char t = (char) (ascii - 32);
					sb.deleteCharAt(i);
					sb.insert(i, t);
				}
			}
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		System.out.println("result: " + sb);
		sc.close();
	}

}
