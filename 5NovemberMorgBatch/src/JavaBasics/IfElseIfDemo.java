package JavaBasics;

public class IfElseIfDemo {
	public static void main(String[] args)
	{
		String ProjectDomain = "Telecom";
		
		if(ProjectDomain == "Healthcare")
		{
			System.out.println("Communication related work");
		}
		
		else if(ProjectDomain == "Healthcare")
		{
			System.out.println("Medical related work");
		}
		
		else if(ProjectDomain == "Banking")
		{
			System.out.println("Money transaction related work");
		}
		else
		{
			System.out.println("Project domain is dismatched");

		}
	}
}
