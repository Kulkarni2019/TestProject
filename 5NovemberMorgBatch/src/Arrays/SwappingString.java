package Arrays;

public class SwappingString {
	
	public static void main(String[] args)
	{
		String str1="Hello";
		String str2="World";
		
		System.out.println("String before swapping: "+ str1 + " " + str2);
		
		//concatenate both the string str1 and str2 and store it in str1
		str1= str1+str2;
		
		//Extract the str2 from updated str1
		str2=str1.substring(0,(str1.length()-str2.length()));
		
		//Extract str1 from updated str1
		str1=str1.substring(str2.length());
		
		System.out.println("String after swapping: "+ str1 + " " + str2);
	}

}
