package Collection;

public class GenericMethod <G,M> {
	
	G b;
	G Demo(M a) {
		System.out.println(a);
		return b;
	}
	
	public static void main(String...args)
	{
   GenericMethod <Integer,Character> y= new GenericMethod <Integer,Character>();
   y.b=78;
   
   int z= y.Demo('u');
	System.out.println(z);

	}

}
