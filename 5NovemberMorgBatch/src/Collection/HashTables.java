package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashTables {

	public static void main(String[] args)
	{
		HashMap<Character,Integer> tables= new HashMap<Character,Integer>();
		
		tables.put('%', null);
		tables.put(null, 10);
		tables.put('&', 12);
		tables.put('*', 14);
		tables.put(null, 16);
		
		for(Map.Entry<Character, Integer> t: tables.entrySet())
		{
			System.out.println("Key=" + t.getKey() + " Value=" + t.getValue());
		}
	}
}
