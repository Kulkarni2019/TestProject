package Inheritance;

public class Super1 extends Super {
	
	int a= 10; // global variable
	
	public void Test()
	{
		int a= 30; //local variable
		System.out.println(a); //accessing local variable
		System.out.println(this.a); //accessing global variable from same class
		System.out.println(super.a); //accessing global variable from Super class
		System.out.println(super.s);
	}
	public static void main(String[] args)
	{
		Super1 x= new Super1();
		x.Test();
	}

}
