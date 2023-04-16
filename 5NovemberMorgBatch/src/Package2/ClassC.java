package Package2;

import Package1.ClassA;

public class ClassC {
	
	public static void main(String[] args)
	{
		ClassA p= new ClassA();
	  System.out.println(p.a); // accessing public variable in another class of different package
	  //System.out.println(p.b);  private variable not accessible 
	  //System.out.println(p.c);  protected variable not accessible
	  //System.out.println(p.s);  default variable not accessible

}
}
