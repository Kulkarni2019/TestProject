package InterfaceTesting;

public class Testing1 implements Demo {
	
	public void Demotest()
	{
		System.out.println("Method is running from interface");
	}
 public static void main(String[] args)
 {
	 Testing1 x = new Testing1();
	 System.out.println(Demo.a);
	 System.out.println(Demo.b);

	 x.Demotest();
 }
}
