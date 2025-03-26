package com.qa.practise.stringsqs;

public class CountStringWords {

	public static void main(String[] args) 
	{
		String input = "I am not a String";
		int count = 0;
		
		System.out.println(input.split(" ").length);
		
		for(int i = 0; i < input.length(); i++)
		{
			if(Character.isWhitespace(input.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count + 1);
	}
}
