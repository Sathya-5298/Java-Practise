package com.qa.practise.stringsqs;

import java.util.HashMap;

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
	}
}
