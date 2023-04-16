package Casting;

public class TestUpCasting {

	public static void main(String[] args)
	{
		System.out.println("******* Super class methods ******");
		Upcasting x= new Upcasting();
		x.show();
		x.set();
		x.cast();
		System.out.println();
		
		System.out.println("******* Sub class methods ******");

		UpCast1 y= new UpCast1();
		y.set();
		y.show();
		y.Subclass();
		y.cast();
		System.out.println();

		System.out.println("******* Casting methods ******");

		Upcasting z= new UpCast1();   // upcasting syntax
		// superclass ref variable = new subclass
		z.set();
		z.show();
		z.cast();
		
		UpCast1 s= (UpCast1) new Upcasting();  // down casting syntax
		// subclassname ref variable= (subclassname) new superclass()
		s.set();
		s.show();
		s.Subclass();
		s.cast();
     }
}
