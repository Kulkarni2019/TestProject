package Collection;

public class AdvancedForLoops {
	
	public static void main(String...args)
	{
		int[] numbers = {120,132,78,56,90};
		int addition=0;
		
		for(int num: numbers)
		{
			System.out.println(num);
			addition += num;
        }
		System.out.println("---------After addition---------");

		System.out.println("Addition is=" + addition);
	}

}
