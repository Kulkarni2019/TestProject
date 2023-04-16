package Practise;

public class Overloading {
	
	public void add(int x, int y)
	{
		System.out.println(x + y);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}
    public static void main(String[] args)
    {
    	Overloading x= new Overloading();
    	x.add(10, 20);
    	x.add(23, 56, 60);
    }
}
