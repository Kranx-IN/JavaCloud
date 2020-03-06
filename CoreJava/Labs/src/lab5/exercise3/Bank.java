package lab5.exercise3;

public class Bank extends Account {

	@Override
	public void withdraw(double value) {
		double balance =  super.getBalance();
		super.setBalance(balance - value);
	}

}
