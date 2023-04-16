package Collection;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String...args)
	{
		ArrayList list= new ArrayList();
		
		list.add("Shraddha");
		list.add("Shruti");
		list.add("#");
		list.add("&");
		list.add(1343);
		list.add(71.68F);
		
		//System.out.println(list.size());
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		
		System.out.println("******After deletion of object*******");
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println(list.get(4));
	}

}
