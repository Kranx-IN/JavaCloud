package number;

public class WrapperDemo3 {

	public static void main(String[] args) {
		int x = 1000;
		Integer obj = new Integer(x);	//Boxing
		
		int y = obj.intValue();		//Unboxing
		
		
		Integer obj2 = x;		//auto boxing
		
		
	}
}
