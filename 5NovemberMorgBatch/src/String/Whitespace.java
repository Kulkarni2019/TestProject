package String;

public class Whitespace {
	
	public static void main(String[] args)
	{
	
	String as= "ABC PQR STV UIV";
	int total=0;
	for(int i=0;i<=as.length()-1;i++)
	{
		char z= as.charAt(i);
		//System.out.println(z);
      if(z == ' ')
      {
    	  total++;
      }
	}
      System.out.println(total);
}
}