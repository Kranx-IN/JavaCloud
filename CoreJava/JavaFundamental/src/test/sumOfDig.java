package test;

public class sumOfDig {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]),sum=0,rem;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("the sum is: "+sum);
	}
}
