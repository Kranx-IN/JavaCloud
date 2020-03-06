package lab5.exercise3;

public class BankApp{

	public static void main(String[] args) {
		Account smith = new Bank();
		smith.setBalance(2000);
		
		Person p = new Person();
		p.setName("Smith");
		p.setAge(25f);
		smith.setPerson(p);
		
		//Kathy account creation
		
		Account kathy = new Bank();
		kathy.setBalance(3000);

		Person p2 = new Person();
		p2.setName("Kathy");
		p2.setAge(20f);
		kathy.setPerson(p2);

		System.out.println(smith);
		System.out.println("------------");
		System.out.println(kathy);

		smith.deposit(2000);
		kathy.withdraw(2000);

		System.out.println("-------------------");
		System.out.println(smith);
		System.out.println("------------");
		System.out.println(kathy);
	}

}
