package oop8;

interface I1 {
	// int i = 100;
	public static final int i = 100;

	void meth1();

	public static void meth2() {
		System.out.println("static fancshaan");
	}

	public default void meth3() {
		System.out.println("default methaad");
	}
}

class C1 implements I1 {

	@Override
	public void meth1() {
		System.out.println("x:" + I1.i);
	}

}

public class InterfaceApp {

	public static void main(String[] args) {
		I1 ref = new C1();
		ref.meth1();

		I1.meth2();
		ref.meth3();
	}

}
