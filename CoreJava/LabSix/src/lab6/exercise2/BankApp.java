package lab6.exercise2;

public class BankApp {

	public static void main(String[] args) {
		// smith account Creation
		Person p = new Person();
		try {
			p.setName("Smith");
			p.setAge(14);
			Account smith = new Savings();
			smith.setBalance(2000);
			smith.setPerson(p);
			System.out.println("-------------------");
			System.out.println(smith);
		} catch (UnderAgeException e) {
			System.out.println(e);
			p = null;
		}

		// Kathy account creation
		Person p2 = new Person();
		try {
			p2.setName("Kathy");
			p2.setAge(25);
			Account kathy = new Current();
			kathy.setBalance(3000);
			kathy.setPerson(p2);
			System.out.println("------------");
			System.out.println(kathy);
		} catch (UnderAgeException e) {
			System.out.println(e);
			p2 = null;
		}
		
		System.gc();

	}

}
