package Package1;

public class ClassA {
	public int a=10;
	private int b= 30;
	protected int c= 23;
	int s= 20;
	
	public static void main(String[] args)
	{
		ClassA z= new ClassA();
		System.out.println(z.a); // calling variable with public access specifier 
		System.out.println(z.b); // calling variable with private access specifier 
		System.out.println(z.c); // calling variable with protected access specifier 
		System.out.println(z.s); // calling variable with default access specifier 

	}

}
