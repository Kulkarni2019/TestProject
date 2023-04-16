package Collection;

public class GenericBasic <G> {
	int b;
	G a;
	public static void main(String...args)
	{
		GenericBasic x= new GenericBasic(); // Generic are used to defined generalized parameter for variable or methods.
		x.b=23;
		System.out.println(x.b);
		
		/*x.b=45.9F;  b is a int data type variable so it will store only int values.
		System.out.println(x.b);*/
		
		x.a=23.9F;
		System.out.println(x.a);
		
		x.a='S';
		System.out.println(x.a);
		
		x.a="Shraddha";
		System.out.println(x.a);
		}

}
