package Methods;

public class basiccl { // non static method declare in same class
	                  //and call in same class
void Demo() 
	{
		System.out.println("Demo method running");
	}

public static void Test() 
{
	System.out.println("Test method running");
}
public static void main(String[] args)
{
	basiccl x= new basiccl(); // object creation
	x.Demo(); // non static method calling same class
	Test();   // static method calling same class
}
}
