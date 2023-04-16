package Collection;

public class Generics <G>{
	
	char a;
	G x;
	
	static public void main(String[] args)
	{
		Generics<Integer> b= new Generics<Integer>();
		b.a='r';
		System.out.println(b.a);
		
		b.x=90;
		System.out.println(b.x);
		
		Generics<String> y= new Generics<String>();
		y.x="Swami";
		System.out.println(y.x);
		
		
	}

}
