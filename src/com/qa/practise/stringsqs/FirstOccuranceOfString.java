package com.qa.practise.stringsqs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class FirstOccuranceOfString {

	public static void main(String[] args) 
	{
		String s = "abbacdabb";
		
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c: ch)
		{
			set.add(c);
		}	
		
		Iterator<Character> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(char ds : set)
		{
			sb.append(ds);
		}
		
		System.out.println("FirstOccuranceOfString is "+ sb.toString());
	}
}
