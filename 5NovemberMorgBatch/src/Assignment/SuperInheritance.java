package Assignment;

public class SuperInheritance {
	
	int a = 25;
	static float x = 20.45f;
	
	public void show()
	{
		System.out.println("Method of super class is running");
	}
	
	public static void main(String[] args)
	{
		SuperInheritance c= new SuperInheritance();
		System.out.println(c.a);
		System.out.println(x);
		c.show();
		}

}
