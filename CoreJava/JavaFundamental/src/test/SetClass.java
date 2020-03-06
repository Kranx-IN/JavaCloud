package test;

import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		set.add("anu");
		set.add("anil");
		
		for(Object o : set) {
			System.out.print(o + " ");
		}
		
	}

}
