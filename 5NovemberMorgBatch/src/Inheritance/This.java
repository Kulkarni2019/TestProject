package Inheritance;

public class This {
	
	//String s="Shree"; // global variable
	  int b= 20;
	
	public void Demo()
	{
		int a= 23; // local variable
		System.out.println(a); // calling local variable 23
		System.out.println(b); // accessing global variable throughout the class
	}

	public static void main(String[] args)
	{
		This b= new This();
		b.Demo();
	}
}
