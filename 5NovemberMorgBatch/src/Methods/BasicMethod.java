package Methods;

public class BasicMethod {
	static int Demo()
	{
	int x= 12;
	int y= 12;
	int z= x + y;
	System.out.println(z);
	return z;
	
}
	static String Demo1()
	{
		return "Welcome to velocity";
	}
	
	public static void main(String[] args)
	{
		Demo();
		String abc= Demo1();
		System.out.println(abc);
	}
}
