package Collection;

import java.util.HashSet;

public class HashSets1 {
	public static void main(String...args)
	{
		//order of insertion is random
		HashSet<String> set= new HashSet<String>();
		
		set.add("Hello");
		set.add(null);
		set.add("Welcome");
		set.add("India");
		
		for(String s: set)
		{
			System.out.println(s);
		}
		set.add(null);          //single null value is accepeted.
		set.add("Velocity");
		set.add(null);
		System.out.println("*********************");
		for(String s: set)
		{
			System.out.println(s);
		}
		
	}

}
