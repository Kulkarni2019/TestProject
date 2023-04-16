package AbstractionEncapsulationGeneralization;

public class TestEncapsulation {
	
	public static void main(String[] args)
	{
		Encapsulation x= new Encapsulation(); // accessing method from Encapsulation class where variable are private
		x.demo1();
		
		Encapsulation z= new Encapsulation(20,20);
		z.demo1();
	}

}
