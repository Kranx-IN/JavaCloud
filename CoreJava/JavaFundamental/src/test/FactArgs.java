package test;

public class FactArgs {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		long fact=1;
		System.out.println(num);
		while(num>0) {
			fact=fact*num;
			System.out.println(fact);
			num--;
		}
		System.out.println("the factorial: "+fact);
	}
}
