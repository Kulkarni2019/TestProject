package Arrays;

public class Multidimensional {
	
	public static void main(String[] args)
	{
		int a[] []= {{20,30,10},{10,50,60},{15,17,19}}; // multidimensional array declaration
		int b=a.length;
		//System.out.println(b);
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
