package Assignment;

public class StaticNonstatic1 {
	
	static public void main(String...args)
	{
		StaticNonstaticMethod n= new StaticNonstaticMethod();
		System.out.println(n.b);
		System.out.println(n.a);
		n.test();
		n.demo();
}

}
