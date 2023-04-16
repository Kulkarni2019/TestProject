package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String...args)
	{
		Hashtable<String,Integer> table= new Hashtable<String,Integer>();
		
		table.put("Shraddha", 24);
		table.put("Shubham", 26);
		table.put(null, 28);
		table.put("Anita", 30);
		table.put("Vishal", null);
		
		for(Map.Entry<String, Integer> t: table.entrySet())
		{
			System.out.println("key=" + t.getKey() + " value=" + t.getValue());
		}
	}

}
