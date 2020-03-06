package test;

public class PrimeNum {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[1]);			//args[1]=217 
		boolean prime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime");
		}
			
	}
}
