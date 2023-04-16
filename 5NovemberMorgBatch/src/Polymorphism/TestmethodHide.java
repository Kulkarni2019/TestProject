package Polymorphism;

public class TestmethodHide extends MethodHide {
	
	public static void Demo()
	{
		System.out.println("Demo method from sub class");
	}
	
	public static void main(String[] args)
	{
		MethodHide.Demo(); // calling static method from another class with classname.method name
		Demo();   // calling static method from sub class
	}
	
	/*public static void main(String[] args)
	{
		System.out.println("Main method from sub class");
	}*/

}
