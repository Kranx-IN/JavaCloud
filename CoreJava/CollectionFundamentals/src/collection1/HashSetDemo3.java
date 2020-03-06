package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1000);
		set.add(new Integer(2000));
		Integer i = new Integer(3000);
		set.add(i);

		//set.add("Two");

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer obj = itr.next();
			System.out.println("Product of number: " + obj*2);
		}
	}
}
