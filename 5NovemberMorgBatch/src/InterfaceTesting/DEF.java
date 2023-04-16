package InterfaceTesting;

public class DEF implements ABC, XYZ {
	
	public void Demo1()
	{
		System.out.println("Demo1 method is running.");
	}
	
	public void Defines()
	{
		System.out.println("Defines method is running.");
	}
	
	public void Addition()
	{
		int a=10;
		int b=20;
		int c= a + b;
		System.out.println(c);
		System.out.println("Addition is performed.");
		}
		
    public void Memo()
	{
    	int x= 20;
    	int y= 40;
    	int d= x * y;
    	System.out.println(d);
		System.out.println("Multiplication is performed.");
    	
       }
}