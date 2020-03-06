package com.capgemini.lambda;

interface Displable{
	//public String display(String msg);
	public double[] opr(double n1,double n2);
}


public class LamdaDemo5 {
	public static void main(String[] args) {
		
		/*Displable disp = (msg) -> "Hello " + msg;
		System.out.println(disp.display("World!"));*/
		
		Displable disp = (n1,n2) -> {
			double[] ans = new double[4];
			ans[0] = n1+n2;
			ans[1] = n1-n2;
			ans[2] = n1*n2;
			ans[3] = n1/n2;
			return ans;
		};
		for(double m : disp.opr(4, 5)) {
			System.out.println(m);
		}
		
	}
}