package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	public static void main(String[] args)
	{
		//order of insertion is RANDOM
		HashMap<Integer,String> maps= new HashMap<Integer,String>(); 
		
		maps.put(10,null);
		maps.put(null,"Shraddha");
		maps.put(30,"Tadmari");
		maps.put(40,null);
		maps.put(null,"Solapur");

		for(Map.Entry<Integer,String> m: maps.entrySet())
		{
			System.out.println("key=" + m.getKey() + " value=" + m.getValue());
		}
		System.out.println("---------------------");
		
		maps.put(70,"Automation");
		
		for(Map.Entry<Integer,String> m: maps.entrySet())
		{
			System.out.println("key=" + m.getKey() + " value=" + m.getValue());
		}

	}

}
