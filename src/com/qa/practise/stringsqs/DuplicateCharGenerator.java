package com.qa.practise.stringsqs;

public class DuplicateCharGenerator 
{
	public static void main(String[] args) 
	{
		String s = "abcde";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++)
		{
			sb.append(s.charAt(i));
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}
