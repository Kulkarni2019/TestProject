package Methods;

public class Demobasic { // static method declare in same class
                           //and call in same class	
	public static void Demo()// user defined method
	{
		System.out.println("Demo method running");
	}
    public static void Test()
    {
    	System.out.println("Test method running");
    }
    
    public static void main(String[] args)
    {
    	Demo();
    	Test();
    }
}
