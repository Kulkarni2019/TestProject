package Exception;

public class Basic {

	static void Test()
	{
		throw new NullPointerException();
	}
	
	static void Demo()
	{
		throw new ArithmeticException();
	}
	
	public static void main(String...args) throws InterruptedException
	{
		int a=10;
		int b=0;
		int c= a/b;
		System.out.println(c);
		
		System.out.println("Main method running.");
		Thread.sleep(2000);
		Test();
		Demo();
	}
}
