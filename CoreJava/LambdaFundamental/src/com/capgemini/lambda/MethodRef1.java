package com.capgemini.lambda;

@FunctionalInterface
interface Adder{
	public int add(int n1,int n2);
}
@FunctionalInterface
interface Show{
	public void show(int n1,int n2);
}
class AdderImpl{
	public static int addition1(int n1, int n2){
		System.out.println("static method has been called");
		return n1+n2;
	}	
	public int addition2(int n1, int n2){
		System.out.println("non static method has been called");
		return n1+n2;
	}
	AdderImpl(int n1,int n2)
	{	
		System.out.println("Constructor has been called");
		int res = n1+n2;
		System.out.println(res);
	}
	AdderImpl(){};
}
public class MethodRef1 {
	public static void main(String[] args) {
		
		Adder ref1 = (n1,n2) -> n1+n2;
		System.out.println("Ref1: " + ref1.add(4, 5));
		System.out.println("----------------------------------------");
		Adder ref2 = (n1,n2) -> AdderImpl.addition1(n1, n2);
		System.out.println("Ref2: " + ref2.add(55, 45));
		System.out.println("----------------------------------------");
		Adder ref3 = AdderImpl::addition1;
		System.out.println("Ref3: " + ref3.add(6, 45));
		System.out.println("----------------------------------------");
		Adder ref4 = (n1,n2) -> new AdderImpl().addition2(n1, n2);
		System.out.println("Ref4: " + ref4.add(7, 8));
		System.out.println("----------------------------------------");
		Adder ref5 = new AdderImpl()::addition2;
		System.out.println("Ref5: " + ref5.add(16, 4));		
		System.out.println("----------------------------------------");
		Show ref6 = (n1,n2) -> new AdderImpl(n1,n2);
		System.out.print("Ref6: ");ref6.show(22, 66);
		System.out.println("----------------------------------------");		
	}
}