package Constructor;

public class Basic { // user define
	Basic() // default constructor
	{
		
      }
	
	int y; // data member or variable
	String s;
	
	public static void main(String[] args)
	{
		Basic a = new Basic();
		System.out.println(a.y);
		System.out.println(a.s);

	}
}