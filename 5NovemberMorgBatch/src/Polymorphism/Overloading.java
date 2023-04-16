package Polymorphism;

public class Overloading {    //non static method
	
	public void addition(int a, int b)  //method overloading same method name only arguments are changed
	{
		System.out.println(a + b);
	}
  public void addition(int a, int b, int c)
  {
	  System.out.println(a + b + c);
  }
  public static void main(String[] args)
  {
	  Overloading x= new Overloading();
	  x.addition(30, 50);
	  x.addition(12, 21, 20);
  }
}
