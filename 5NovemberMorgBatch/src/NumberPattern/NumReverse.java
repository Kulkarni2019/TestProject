package NumberPattern;

public class NumReverse {
	
	public static void main(String[] args)
	{
		int num=5;
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=num; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
			num--;
		}
	}

}
