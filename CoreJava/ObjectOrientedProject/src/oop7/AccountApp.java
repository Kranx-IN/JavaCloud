package oop7;

public class AccountApp {

	public static void main(String[] args) {
		//Account a =  new Account(); its abstraact class
		Account acc = new Saving();
		acc.displayAccountInfo();
	}

}
