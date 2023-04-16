package Assignment;

public class GlobalVariable {
	
	static String s= "Shree";
	int a= 10;
	
	public void set()

	{
		System.out.println("set method is running");
	}
	
	public static void main(String[] args)
	{
		GlobalVariable x= new GlobalVariable();
		System.out.println(x.a);
		System.out.println(x.s);
		x.set();

		
	}

}
