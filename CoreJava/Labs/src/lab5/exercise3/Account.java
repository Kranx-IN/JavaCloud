package lab5.exercise3;

public abstract class Account {
	private static long accNumber = 1;
	
	private long accNum;
	private double balance;
	private Person person;
	
	Account(){
		this.accNum = accNumber++;
		this.balance = 500;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void deposit(double deposit) {
		setBalance(deposit + balance);
	}

	public abstract void withdraw(double value);

	@Override
	public String toString() {
		return "Account Number: " + accNum + " Balance: " + balance + "\n" + this.person;
	}
}
