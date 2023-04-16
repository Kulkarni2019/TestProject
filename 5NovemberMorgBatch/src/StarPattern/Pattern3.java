package StarPattern;

public class Pattern3 {
  public static void main(String[] args)
  {
	  int star = 5;
	  for(int i=5; i>=1; i--)
	  {
		  for(int j=1; j<=star; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		 star --;
	  }
  }
}
