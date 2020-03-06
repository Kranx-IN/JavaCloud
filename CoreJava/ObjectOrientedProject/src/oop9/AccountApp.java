package oop9;

public class AccountApp {

	public static void main(String[] args) {		
		Account acc = new Account();
		acc.setAccNumber(696969);
		acc.setAccBalance(500);
		
		Customer customer = new Customer();
		customer.setFirstName("Shailesh");
		customer.setLastName("Singh");
		
		acc.setCustomer(customer);
		
		System.out.println(acc.toString());
		System.out.println(acc.getCustomer().toString());
	}

}
