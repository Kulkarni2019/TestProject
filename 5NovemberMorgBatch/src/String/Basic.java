package String;

public class Basic {
	
	public static void main(String[] args)
	{
		String a= "Shraddha";
		String b= "Shraddha";
		
		String c= new String("Shruti");
		String d= new String("Shruti");

       System.out.println(a==b); //true
       System.out.println(c==d); //false
       System.out.println(a==c); //false
       
       System.out.println("****************************");
       
       b="ABC";
       System.out.println(a);
       System.out.println(b);

       System.out.println(a==b); //false

       System.out.println("****************************");
       b="Shraddha";
       System.out.println(a);
       System.out.println(b);

       System.out.println(a==b); //true

 }

}
