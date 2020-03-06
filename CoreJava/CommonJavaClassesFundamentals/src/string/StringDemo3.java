package string;

public class StringDemo3 {

	public static void main(String[] args) {
		String str1 = "Capgemini";// object 1
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			str1 = str1 + " Pune";
		}
		System.out.println(str1.substring(0,14));
		long end = System.currentTimeMillis();
		System.out.println("time taken to execute: "+(end-start)+"ms");
	}

}
