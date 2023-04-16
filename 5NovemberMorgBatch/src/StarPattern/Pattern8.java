package StarPattern;

public class Pattern8 {
	public static void main(String[] args)
	{
		int star=5;
		//int space=0;
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i=1;i<=star-1;i++)
			{
				for(int j=star-1;j>=i;j--)
				{
					System.out.print("*");
				}
				for(int k=1; k<i;k++)
				{
					System.out.print(" ");
				}
				System.out.println();
		}
	}

}

