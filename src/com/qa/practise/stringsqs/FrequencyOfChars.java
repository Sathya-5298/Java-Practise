package com.qa.practise.stringsqs;

import java.util.HashMap;

public class FrequencyOfChars 
{
	public static void main(String[] args) {
		String s = "Hamollo";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		
		for(char character : ch)
		{
			hm.put(character, hm.getOrDefault(character, 0)+1); 
			// getOrDefault returns the value to which the specified key is mapped, or 
			// defaultValue if this map contains no mapping for the key
		}
		
		for(char c : hm.keySet())
		{
				System.out.println(c + " Frequency " + hm.get(c));
		}
	}
}
