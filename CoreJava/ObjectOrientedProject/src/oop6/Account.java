package oop6;

public class Account {
	protected String accountHolderName;
	protected long accountNumber;
	protected double accountBalance;
	
	Account(){}
	
	public Account(String name,long number,double balance){
		accountHolderName = name;
		accountNumber = number;
		accountBalance = balance;
	}
	public void showDetails() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account holder name: "+accountHolderName);
		System.out.println("Account balance: "+accountBalance);
	}
}
