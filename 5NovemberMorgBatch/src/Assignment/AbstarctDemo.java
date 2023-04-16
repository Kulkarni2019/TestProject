package Assignment;

public class AbstarctDemo extends Abstract1 {

	
	public void show()
	{
		System.out.println("Show Method is running from abstractdemo class");

	}
	public void demo()
	{
		System.out.println("Demo method is running from sub class");
	}
	public void test()
	{
		System.out.println("Method is running from abstractdemo class");
	}
	
	public static void main(String[] args)
	{
		AbstarctDemo x= new AbstarctDemo();
		x.show();
		x.test();
	    x.demo();
		System.out.println(x.a);
		
	}
}
