package Constructor;

public class Basic1 {
	
	int a;
	int b;
	int m;
	String velocity;
	
	Basic1()
	{
		a= 23;
		b=20;
	}
	
	Basic1(int c, int d)
	{
		a=c;
		b=d;
	}
	
	Basic1(int c, int d, int j)
	{
		a=c;
		b=d;
		m=j;
	}
	
	public void addition()
	{
		System.out.println(m+a+b);
	}
	
	public static void main(String[] args)
	{
		Basic1 x= new Basic1();
		x.addition();
		
		Basic1 y= new Basic1(60,60);
		y.addition();
		
		Basic1 z= new Basic1(50,40,20);
		z.addition();
		
		
	}

}
