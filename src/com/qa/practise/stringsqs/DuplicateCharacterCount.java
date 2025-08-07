package com.qa.practise.stringsqs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {

	public static void main(String[] args) 
	{
		String input = "TODO Auto-generated method stub";
		input = input.toLowerCase().replace(" ", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = input.toCharArray();
		
		for(char chr: ch)
		{
			if(map.containsKey(chr))
			{
				map.put(chr, map.get(chr) + 1);
			}
			else
			{
				map.put(chr, 1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey() + " is apperaing " + entry.getValue() + " times");
			}
		}
	}
}
