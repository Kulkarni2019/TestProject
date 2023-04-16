package JavaBasics;

public class NestedIfExample {
	public static void main(String[]args)
	{
		int age= 15;
		int weight = 50;
		
		if(age >= 18)
		{
			if(weight >= 50)
			{
				System.out.println("A person is able to donate blood");
			}
			else
			{
				System.out.println("A person is not able to donate blood");
			}
		}
		else
		{
			System.out.println("A person must have to completed 18 to donate blood");
		}
		
		}
		
	}

