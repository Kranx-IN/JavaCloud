package number;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int x = 1000;
		short s = (short) x;

		float f = 100.0f;
		double d = 100000.0;

		f = (float) d;
		
		d = x; 
		
		boolean a = true;
	}

}
