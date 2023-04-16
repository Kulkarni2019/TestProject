package StarPattern;

public class Star6 {
	public static void main(String[] args)
	{
		int star=6;
		int space=4;
		for(int i=0; i<=star-1; i++)
		{
			for(int j=0; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=star-1-i; k++)
			{
				System.out.print("*" + " ");
		       }
				System.out.println();
		}
	}

}
