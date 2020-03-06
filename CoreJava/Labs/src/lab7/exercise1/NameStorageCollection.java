package lab7.exercise1;

import java.util.Scanner;

public class NameStorageCollection {

	public static void main(String[] args) {
		int len = 0;
		String[] names;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to enter");
		len = s.nextInt();
		names = new String[len];
		s.nextLine();
		for (int i = 0; i < len; i++) {
			System.out.println("Enter the " + (i + 1) + "th name: ");
			names[i] = s.nextLine();
		}

		System.out.println("BEFORE SORT: ");
		for (int i = 0; i < len; i++) {
			System.out.print((i + 1) + "." + names[i] + " ");
		}

		names = sortProductNames(names);
		System.out.println("\nafter sorting");
		for (int i = 0; i < len; i++) {
			System.out.print((i + 1) + "." + names[i] + " ");
		}
	}

	private static String[] sortProductNames(String[] names) {

		for (String e : names) {
			e = e.toLowerCase();
		}

		for (int i = 0; i < names.length; i++) {
			String temp = "";
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].charAt(0) > names[j].charAt(0)) {
					temp = names[j];
					names[j] = names[i];
					names[i] = temp;
				}

			}
		}
		return names;
	}

}
