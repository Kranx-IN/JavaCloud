package string;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = "Capgemini"; // gets created in string constant pool
		String str2 = new String("Capgemini"); // in heap area as a new object
		String str3 = "Capgemini"; // refers to the str1 in string pool
		String str4 = new String("Capgemini"); // new object created

		if (str1 == str3) { // compares references
			System.out.println("str1 == str3"); // ans
		} else {
			System.out.println("str1 != str3");
		}

		if (str2 == str4) { // compares references
			System.out.println("str2 == str4");
		} else {
			System.out.println("str2 != str4"); // ans
		}
		
		if (str2.equals(str4)) { // compares data
			System.out.println("str2 == str4"); // ans
		} else {
			System.out.println("str2 != str4");
		}

		if (str2.equalsIgnoreCase(str4)) { // compares data
			System.out.println("str2 == str4"); // ans
		} else {
			System.out.println("str2 != str4");
		}
	}

}
