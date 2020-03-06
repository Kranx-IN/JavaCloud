package exception4;

public class Main {
	public static boolean validateAge(int age) throws AgeException{
		if (age >= 21 && age <= 60)
			return true;
		else
			throw new AgeException(age);
	}

	public static void main(String[] args) {
		int age = 353;
		try {
			boolean result = Main.validateAge(age);
		} catch (AgeException e) {
			System.out.println(e);
		}
	}

}
