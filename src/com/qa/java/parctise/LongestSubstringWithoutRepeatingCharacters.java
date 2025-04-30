package com.qa.java.parctise;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters 
{
	public static void main(String[] args) 
	{
		String input = "abcdbbcda";
	//	System.out.println(longestSubString(input));
		System.out.println(findLongestSubstring(input));
	}

	    public static int findLongestSubstring(String s) 
	    {
	        HashSet<Character> set = new HashSet<Character>();
	        int maxLength = 0;
	        int left = 0;

	        for (int right = 0; right < s.length(); right++) {
	            // Remove characters from the set if there’s a duplicate
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left));
	                left++; // Move the left pointer
	            }
	            // Add the current character to the set
	            set.add(s.charAt(right));
	            // Update the maximum length
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	        return maxLength;
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
