package Polymorphism;

public class Riding2 extends Riding {  //overriding

	public void statement()
	{
		System.out.println("Method is running from subclass");
	}
	public static void main(String[] args)
	{
		Riding2 x= new Riding2();  // method from riding2 running
		x.statement();
		
		Riding y= new Riding(); // method from riding running
		y.statement();
		
		Riding z= new Riding2(); // method is running from subclass overriding
		z.statement();
	}
}

