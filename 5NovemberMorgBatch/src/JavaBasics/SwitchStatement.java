package JavaBasics;

public class SwitchStatement {
     public static void main(String[]args)
      {
	    int age = 15;
	    switch(age)
	    {
	    case(16): 
	    	System.out.println("You are under 18.");
	    break;
	    
	    case(18):
	    	System.out.println("You are eligible for vote.");
	    break;
	    
	    case(65):
	    	System.out.println("You are senior citizen.");
	    break;
	    
	    default:
	    	System.out.println("Please provide valid age.");
	    	
	    		}
           }
   }
