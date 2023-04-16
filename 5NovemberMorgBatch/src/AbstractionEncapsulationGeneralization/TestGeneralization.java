package AbstractionEncapsulationGeneralization;

public class TestGeneralization {
	
	public static void main(String[] args)
	{
		System.out.println("-----Jio unlimited plans-----");
		Jio x= new Jio();
		x.AutoCalling();
		x.TextMessage();
		x.InternetData();
		x.Subscription();
		
		System.out.println();
		
		System.out.println("-----Vi unlimited plans-----");
		Vi y= new Vi();
		y.AutoCalling();
		y.TextMessage();
		y.InternetData();
		y.Subscription();
		
		System.out.println();

		System.out.println("-----Airtel unlimited plans-----");
		Airtel z= new Airtel();
		z.AutoCalling();
		z.TextMessage();
		z.InternetData();
		z.Subscription();
		
		
	}

}
