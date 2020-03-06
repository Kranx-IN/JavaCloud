package string;

public class StringDemo4 {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("capgemini");

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			str1 = str1.append(" pune");
		}
		System.out.println(str1.substring(0, 14));
		long end = System.currentTimeMillis();
		System.out.println("time taken to execute: " + (end - start) + "ms");
	}
}
