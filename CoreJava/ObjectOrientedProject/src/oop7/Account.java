package oop7;

public abstract class Account {
	private long accNumber;
	private String accHolderName;
	private double accBalance;

	public Account() {
		this(0, "", 0.0);
	}

	public Account(long accNumber, String accHolderName, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Number: " + accNumber);
		System.out.println("Account Holder Name: " + accHolderName);
		System.out.println("Account Balance: " + accBalance);
	}
}
