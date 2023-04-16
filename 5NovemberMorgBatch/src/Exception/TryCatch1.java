package Exception;

public class TryCatch1 {
	
	public static void main(String[] args)
	{
		int a=45;
		int b=0;
		int c=0;
	   String s[]= {"Ayush","Rama","Vishal","Milan","Kajal","Reva"};
	   
	   try {
		   c=a/b;
		   System.out.println(s[6]);
	   }
	   
	   catch(ArithmeticException e){
		   b=9;
		   c=a/b;
	   }
		   catch(ArrayIndexOutOfBoundsException r)
		   {
			System.out.println(s[1]);
		   }
	   finally {
		   System.out.println("Finally block excuted");
	   }
	   
	      //System.out.println(c);

	   }
	    
	   
	}

