package oop7;

public class Current extends Account {
	private double overdraft;

	public Current() {

	}

	public Current(long accNumber, String accHolderName, double accBalance, double overdraft) {
		super(accNumber, accHolderName, accBalance);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void displayAccountInfo() {
		super.displayAccountInfo();
		System.out.println("Overdraft: " + overdraft);
	}

}
