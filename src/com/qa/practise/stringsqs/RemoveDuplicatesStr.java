package com.qa.practise.stringsqs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesStr 
{
	public static void main(String[] args) 
	{
		String s = "SathyaMurthy";
		
		LinkedHashSet<Character> a = new LinkedHashSet<Character>();
		
		for(char c : s.toCharArray())
		{
			a.add(c);
		}
		
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder();
		
		for(char f: a)
		{
			sb.append(f);
		}
		System.out.println(sb);
	}
}
