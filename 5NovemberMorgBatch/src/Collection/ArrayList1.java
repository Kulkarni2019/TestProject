package Collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String...args)
	{
		//order of insertion is maintained.
		ArrayList<Float> lists= new ArrayList<Float>();
		
		lists.add(71.67F);
		lists.add(40.40F);
		lists.add(72.00F);
		lists.add(null);
		
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i));
		}
		
		lists.add(50.50F);
		lists.remove(2);
		
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i));
		}
	}

}
