package oop7;

public class AccountApp3 {

	public static void main(String[] args) {
		Account acc[] = new Account[2];
		Saving sObj = new Saving();
		Current cObj = new Current();
		
		for (int i = 0; i < acc.length; i++) {
			double a = Math.random();
			if (a > 0.5) {
				acc[i] = sObj;
			} else {
				acc[i] = cObj;
			}
		}
		
		for(Account a:acc) {
			a.displayAccountInfo();
		}
		
	}

}
