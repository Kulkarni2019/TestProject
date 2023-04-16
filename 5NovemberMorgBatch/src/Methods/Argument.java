package Methods;

public class Argument {
	public static void addition(int a, int b) // static method with argument
	{
		int c= a + b;
		System.out.println("Addition is: "+c);
	}
	
	public static void subtraction(double p, double q) // static method with argument
	{
		double r= p - q;
		System.out.println("Subtraction is: "+r);
	}
	
	public static void multiplication(int a, int b) // static method with argument
	{
		int c= a * b;
		System.out.println("Multiplication is: "+c);
	}
	
	
	
	public static void main(String[] args)
	{
		addition(30,40);
		subtraction(21.4,45.9);
		multiplication(45,67);
		
	}

}
