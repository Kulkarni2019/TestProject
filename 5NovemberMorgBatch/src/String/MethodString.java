package String;

public class MethodString {
	
	public static void main(String [] args)
	{
		String s= " Shraddha ";
		String s1= "mumbai";
		String s2= "Kolhapur";
		String s3= "Solapurinky";
		//System.out.println(s1.charAt(2)); //to print character at any index 2 is a index
		
		System.out.println(s2.replace("l", "o")); //to replace old character with new character
		
		System.out.println(s.isEmpty());
		
		System.out.println(s1.concat(s2)); // to combine two strings
		
		System.out.println(s2.substring(2));
		
		System.out.println(s2.substring(2,6));
		
		//System.out.println(s1.startsWith("mu"));
		
	//	System.out.println(s1.startsWith("Mu"));
		
		//System.out.println(s2.endsWith("ai"));
		
		System.out.println(s1.indexOf("b"));
		
		//System.out.println(s2.lastIndexOf("l"));
		
		//System.out.println(s1.length());
		
		//System.out.println(s2.contains("s1"));
		
		System.out.println(s2==s1);
		
		System.out.println(s1.equals(s2));
		
		//System.out.println(s2.equalsIgnoreCase(s1));
		
		//System.out.println(s1.toUpperCase());
		
		//System.out.println(s3.toLowerCase());
		
		//System.out.println(s.trim());
		
		String text= "Maharashtra is a state";
		
		String[] result= text.split(" ");
		
		System.out.print(result);

		
		
		


	}

}
