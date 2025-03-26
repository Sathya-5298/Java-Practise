package com.qa.java.parctise;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters 
{
	public static void main(String[] args) 
	{
		String input = "abcdbbcda";
		System.out.println(longestSubString(input));
	}
	
	public static int longestSubString(String str)
	{
		int start = 0;
		int maxLength = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int end = 0; end < str.length(); end++)	
		{
			char currentChar = str.charAt(end);
			
			if(map.containsKey(currentChar))
			{
				start = Math.max(start, map.get(currentChar) + 1);
			}
			map.put(currentChar, end);
			maxLength = Math.max(maxLength, end - start + 1);
		}
		System.out.println(map.keySet());
		return maxLength;
	}
}
