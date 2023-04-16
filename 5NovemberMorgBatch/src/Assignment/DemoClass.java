package Assignment;

public class DemoClass implements DemoInterface,DemoInterface1 {
	
	public void Passport()
	{
		System.out.println("Passport will ready in 3 months");
	}

	public void Visa()
	{
		System.out.println("Visa will ready in 2 months");

	}
	
	public void set()
	{
		System.out.println("System is set to sleep mode.");

	}
	
	public void reset()
	{
		System.out.println("System will reset after completion of installation");

	}
	
	public static void main(String[] args)
	{
		DemoClass s= new DemoClass();
		s.Passport();
		s.Visa();
       System.out.println(s.x);
       
       DemoClass q= new DemoClass();
       q.set();
       q.reset();
       System.out.println(q.d);

	}
}
