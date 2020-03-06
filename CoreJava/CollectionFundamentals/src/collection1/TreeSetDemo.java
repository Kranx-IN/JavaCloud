package collection1;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1000);
		set.add(new Integer(350));
		set.add(50000);
		set.add(10);
		
		System.out.println(set);
	}

}
