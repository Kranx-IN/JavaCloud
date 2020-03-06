package oop7;

public class Saving extends Account {

	public Saving() {

	}

	public Saving(long accNumber, String accHolderName, double accBalance, double roi) {
		super(accNumber, accHolderName, accBalance);
		this.roi = roi;
	}

	private double roi;

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Rate of Interest: " + roi);
		super.displayAccountInfo();
	}
	
	@Override
	public void finalize() {
		System.out.println("Saving object is garbage");
	}
}
