package AbstractionEncapsulationGeneralization;

public class Airtel implements Simcard {
	
	public void TextMessage()
	{
		System.out.println("Monthly 50 SMS");
	}
	 
	public void AutoCalling()
	{
		System.out.println("Limited calling");
	}

	public void InternetData()
	{
		System.out.println("1.5GB per day");
	}
	
	public void Subscription()
	{
		System.out.println("HotStar subscription");
	}

}
