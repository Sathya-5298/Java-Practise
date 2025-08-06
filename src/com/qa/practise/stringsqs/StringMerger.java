package com.qa.practise.stringsqs;

import java.util.HashMap;

public class StringMerger {

	public static void main(String[] args) 
	{
		String s1 = "abcd";
	    String s2 = "12345";
	    
	    HashMap<Integer, String> map = new HashMap<>();
	    
	    int maxLen = Math.max(s1.length(), s2.length());
	    
	    for(int i = 0; i < maxLen; i++)
	    {
	    	StringBuilder sb = new StringBuilder();
	    	
	    	if(i < s1.length())
	    	{
	    		sb.append(s1.charAt(i));
	    	}
	    	

	    	if(i < s2.length())
	    	{
	    		sb.append(s2.charAt(i));
	    	}
	    	
	    	map.put(i, sb.toString());
	    }
	    
	    StringBuilder result = new StringBuilder();
    	
    	for(int j = 0; j < map.size(); j++)
    	{
    		result.append(map.get(j));
    	}
    	
    	System.out.println("Result:" + result.toString());
	}

}
