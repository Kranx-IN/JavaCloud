package lab4.exercise2;

public class Account {
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

	public void withdraw(double value) {
		setBalance(balance - value);
	}

	@Override
	public String toString() {
		return "Account Number: " + accNum + " Balance: " + balance + "\n" + this.person;
	}
}
