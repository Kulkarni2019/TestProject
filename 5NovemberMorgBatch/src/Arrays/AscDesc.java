package Arrays;

import java.util.Arrays;

public class AscDesc {

	public static void main(String[] args)
	{
		int a[]= {20,70,10,100,6};
		
		//int size=a.length-1;
		//System.out.println(size);
		System.out.println("----- All array info -----");
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("----- All array info in ascending order -----");

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("----- All array info in descending order -----");

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
  }
}
