package Methods;

public class CallABC extends ABC { // concrete class
	
	public void PQR()
	{
		System.out.println("Complete method");
	}
	public void Test() // complete method bcz it has body
	 {
		 System.out.println("Test method reimplemented"); // overridding of Test method in subclass
       }
	public static void main(String[] args)
	{
		CallABC x= new CallABC();
		x.PQR();
		x.Test();
		
		ABC y= new CallABC(); // ABC is a reference class and calling from CallABC class
		y.Test();
	}

}
