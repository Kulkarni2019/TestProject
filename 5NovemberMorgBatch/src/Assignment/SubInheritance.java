package Assignment;

public class SubInheritance extends SuperInheritance {
	
	static double s= 200.00;
	
	public void show()
	{
		System.out.println("Method of subclass is running");
	}
	
	public static void main(String[] args)
	{
		SubInheritance z= new SubInheritance();
		z.show();
		System.out.println(s);
		
		SuperInheritance a= new SuperInheritance();
		a.show();
		System.out.println(a.a);
		System.out.println(x);

		SuperInheritance b= new SubInheritance();
		b.show();
		
}

}
