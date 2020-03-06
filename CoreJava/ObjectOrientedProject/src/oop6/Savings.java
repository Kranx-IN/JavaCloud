package oop6;

public class Savings extends Account {

	private double roi;

	public Savings(String name, long number, double balance, double roi) {
		this.accountHolderName = name;
		this.accountBalance = balance;
		this.accountNumber = number;
		this.roi = roi;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("rate of interest: "+roi);
	}

}
