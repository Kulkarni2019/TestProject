package JavaBasics;

public class IfElseIf {        // ladder if
	public static void main(String[] args)
	{
		int marks= 25;
		if(marks >= 75)
		{
			System.out.println("Student pass in Destinction.");
		}
		
		else if(marks > 60)
		{
			System.out.println("Student pass in first class.");

		}
		else if(marks > 50)
		{
			System.out.println("Student pass in second class.");

		}
		else if(marks >=35)
		{
			System.out.println("Student is pass.");

		}
		else
		{
			System.out.println("Student is fail.");
		}
	}

}
