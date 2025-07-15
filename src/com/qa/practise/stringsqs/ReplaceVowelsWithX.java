package com.qa.practise.stringsqs;

public class ReplaceVowelsWithX {

	public static void main(String[] args) 
	{
		String s = "Hello World";
		String vowels = "AEIOUaeiou";
		
		char[] ch = s.toLowerCase().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : ch)
		{
			if(vowels.indexOf(c) != -1)
			{
				sb.append("X");
			}
			else
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
