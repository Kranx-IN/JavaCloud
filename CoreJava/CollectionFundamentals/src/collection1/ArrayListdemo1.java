package collection1;

import java.util.ArrayList;

public class ArrayListdemo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Capgemini");
		list.add("TCS");
		list.add("Wipro");
		list.add("infy");
		list.add("Google");

		list.add(1, "Facebook");
		
		System.out.println(list);
		System.out.println("Size of list: " + list.size());
	}

}
