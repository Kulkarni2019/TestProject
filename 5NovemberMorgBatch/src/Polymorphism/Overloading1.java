package Polymorphism;

public class Overloading1 {  // static method 
	
	public static void multiplication(int x, int y)
	{
		System.out.println(x * y);
	}
  public static void multiplication(int a, int b, int c)
  {
	  System.out.println(a * b * c);
  }
  
  public static void main(String[] args)
  { 
	  Overloading1.multiplication(10, 20);  // no need to create object of class 
	                                        //just we will call method using classname
	  Overloading1.multiplication(2, 9, 4);
  }
}
