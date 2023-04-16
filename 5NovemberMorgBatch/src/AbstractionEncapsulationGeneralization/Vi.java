package AbstractionEncapsulationGeneralization;

public class Vi implements Simcard {
	
	public void TextMessage()
	{
		System.out.println("Monthly 100 SMS");
	}
	 
	public void AutoCalling()
	{
		System.out.println("Unlimited calling");
	}

	public void InternetData()
	{
		System.out.println("1GB per day");
	}
	
	public void Subscription()
	{
		System.out.println("Voot subscription");
	}
}
