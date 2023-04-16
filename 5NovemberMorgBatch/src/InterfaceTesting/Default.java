package InterfaceTesting;

public interface Default {
   // default method of interface and default is keyword not a specifier
	//mart method is by default public
	
	public default void Mart()
	{
		System.out.println("Shops");
   }
	
	public static void XYZ() // static method of interface
	{
		System.out.println("Static method of interface is running");
	}
	
	public void show(); // incomplete method of interface
}
