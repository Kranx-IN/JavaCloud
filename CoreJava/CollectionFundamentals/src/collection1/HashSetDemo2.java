package collection1;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		
		set.add(1000);
		set.add(2500.50);
		set.add("capgemini pune");
		set.add(new Integer(2345));
		
		System.out.println(set);
	}

}
