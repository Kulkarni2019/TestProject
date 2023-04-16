package AbstractionEncapsulationGeneralization;

public class Encapsulation {
	
	private int a= 10;
	private int b= 15;
	
	Encapsulation()
	{
		a= 20;
		b=23;
	}
	
	Encapsulation(int c, int d)
	{
		a=c;
		b=d;
	}
	
	public void demo1()
	{
		int c= a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Encapsulation x= new Encapsulation();
		x.demo1();
		
		Encapsulation y= new Encapsulation(40,50);
        y.demo1();
	}

}
