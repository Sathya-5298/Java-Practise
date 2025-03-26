package com.qa.practise.stringsqs;

public class StringEncoder 
{
	public static void main(String[] args) 
	{
		String s ="CoreJava";
		String output = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			output += (char) (s.charAt(i) + 1);
		}
		System.out.println(output);
	}
}
