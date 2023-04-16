package Methods;

public class Arguments { // non-static method with arguments
	
	public void division(int a, int b)
	{
		int c= a / b;
		System.out.println("Division is: " +c);
		}
    public static void main(String[] args)
    {
    	Arguments y= new Arguments();
    	y.division(12, 24);
    }
}
