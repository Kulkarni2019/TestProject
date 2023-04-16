package Practise;

public class ArrayBasic {
	
	public static void main(String[] args)
	{
	int a[]= {10,20,30,40,50};
	
	System.out.println("Array before reversing:");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.print(a[i] + " ");
	}
	
	System.out.println("");
	System.out.println("Array after reversing:");
	for(int i= a.length-1; i>=0;i--)
	{
		System.out.print(a[i] + " ");
	}
	
	
	
}
}
