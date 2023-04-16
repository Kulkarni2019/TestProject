package InterfaceTesting;

public class TestDefault implements Default {

	public void show()
	{
		System.out.println("Show method is running");
	}
	
	public void Mart() // it is common and important
	{
		System.out.println("All shops");
	}
	
	public static void main(String[] args)
	{
		TestDefault x= new TestDefault();  // default method is inherited and overrided
		x.Mart();
		x.show();
		Default.XYZ(); // static method of interface
	}
}
