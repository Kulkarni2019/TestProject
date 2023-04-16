package JavaBasics;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=20;
		int sum;
		
		for(int i=1;i<=num;i++)
		{
			sum=0;
			for(int j=2; j<=i /2;j++)
			{
				if(i % j == 0)
				{
					sum ++;
				}
			}
		}
	}
}
