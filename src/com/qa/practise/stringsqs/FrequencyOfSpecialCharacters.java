package com.qa.practise.stringsqs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfSpecialCharacters {

	public static void main(String[] args) 
	{
		String s = "Sathy@M#%@th@";
		char[] ch = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch)
		{
			if(!(c <= 'a' && c >= 'z') || (c <= 'A' && c >= 'Z') || (c <= 0 && c >= 9) || (c == ' '))
			{
				if(map.containsKey(c))
				{
					map.put(c, map.get(c) + 1);
				}
				else
				{
					map.put(c, 1);
				}
			}
		}
		System.out.println(map);
		
		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Character, Integer> entry = itr.next();
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}
}
