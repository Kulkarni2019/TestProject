package Constructor;

public class LocalGlobal {
	
	int a= 10; // global variable
	
	public void Test()
	{
		int b= 20; // local variable
		System.out.println(a); // calling global variable
		System.out.println(b); // calling local variable

	}
	
	public void Demo()
	{
		int c= 25;
		System.out.println(a); // calling global variable
		System.out.println(c); // calling local variable
	}	
	static public void main(String...args)
	{
		LocalGlobal x= new LocalGlobal();
		x.Test();
		x.Demo();
	}

}
