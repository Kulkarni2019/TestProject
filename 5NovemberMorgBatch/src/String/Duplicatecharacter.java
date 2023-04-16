package String;

public class Duplicatecharacter { // duplicate character in given string
	
	public static void main(String [] args)
	{
		String ab= "abccdioo klpmn";
		int total=0;
		int sum=0;
		
		for(int i=0;i<=ab.length()-1;i++)
		{
			char s= ab.charAt(i);
			//System.out.println(s);
			
			if(s== 'a')
			{
				total ++;
			}
			if(s == 'o')
			{
				sum ++;
			}
		}
		System.out.println(total);
		System.out.println(sum);

	}

}
