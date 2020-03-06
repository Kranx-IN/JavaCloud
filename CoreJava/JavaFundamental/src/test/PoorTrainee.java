package test;

import java.util.Scanner;

public class PoorTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic /* = Double.parseDouble(args[2]) */, HRA, DA, Gross;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary:");
		basic = sc.nextDouble();
		if (basic <= 15000) {
			HRA = basic * 0.20;
			DA = basic * 0.70;
		} else if (basic <= 30000) {
			HRA = basic * 0.35;
			DA = basic * 0.80;
		} else {
			HRA = basic * 0.20;
			DA = basic * 0.80;
		}
		Gross = HRA + DA + basic;
		System.out.println("Gross : " + Gross);
		sc.close();
	}

}
