package Arrays;

public class Swappingarray {
	public static void main(String[] args)
	{
		int a[]= {24,67,89,40,90};   //static array
		
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		//a[0]=a[3]; last index-0
		//a[1]=a[2]; last index-1
		for(int i=0;i<(a.length/2);i++)
		{
			int c;
			c=a[i]; //c=15;
			a[i]=a[(a.length-1)-i];
			     // a[3]-0=a[3]=45 so a[3]=45
			a[(a.length-1)-i]=c;
		}
		
		System.out.println();
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
