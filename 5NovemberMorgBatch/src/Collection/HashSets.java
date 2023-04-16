package Collection;

import java.util.HashSet;

public class HashSets {
	public static void main(String...args)
	{
		HashSet sets= new HashSet();
		
		sets.add("@");
		sets.add("Automation");
		sets.add("$");
		sets.add(10234);
		sets.add(null);
		
		for(Object f:sets)
		{
			System.out.println(f);
		}
		sets.remove(10234);
		System.out.println("........................");
		for(Object f:sets)
		{
			System.out.println(f);
		}
	}

}
