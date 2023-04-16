package JavaBasics;

public class NestedIf {
	public static void main(String[]args)
	{
		String UN= "Shree";
		String Pass = "#1234";
		
		if(UN == "Shree")
		{
			System.out.println("Username is correct.");
			if(Pass == "#1234")
			{
				System.out.println("Password is correct.");
				System.out.println("Login successful.");

              }
			else
			{
				System.out.println("Password is incorrect.");
			    System.out.println("Login failed.");
				
			}
		}
		
		else
		{
			System.out.println("Username is incorrect.");
		    System.out.println("Login failed.");
		}
	}

}
