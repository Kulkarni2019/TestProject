package Assignment;

public class StaticNonstaticMethod {
	
	static float a=20.10f;
	int b=20;
	
	public static void demo()
	{
		System.out.println("Static method is running.");
	}
	
	public void test()
	{
		System.out.println("Non-static method is running.");
	}
	
	public static void main(String [] args)
	{
		StaticNonstaticMethod x= new StaticNonstaticMethod();
		StaticNonstaticMethod.demo();
        x.test();
		System.out.println(x.b);
		System.out.println(x.a);

		
	}

}
