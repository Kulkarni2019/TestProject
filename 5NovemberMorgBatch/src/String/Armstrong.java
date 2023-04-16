package String;

public class Armstrong {
	
	public static void main(String [] args)
	{
		int num=153; // 1 + 125 + 27
		int add=0;
		for(int i=num;i>0;i=i/10)
		{
			int remainder= i%10; //3
			
			add= add + (remainder * remainder * remainder);
			//System.out.println(add);
		}
		
		if(num == add)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not armstrong number");

		}
	}

}
