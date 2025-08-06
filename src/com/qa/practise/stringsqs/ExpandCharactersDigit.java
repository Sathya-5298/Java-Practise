package com.qa.practise.stringsqs;

public class ExpandCharactersDigit {

	public static void main(String[] args) 
	{
		String input = "a1b2c3d4";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < input.length(); i = i + 2)
		{
			char ch = input.charAt(i);
			int count = input.charAt(i + 1) - '0';
			
			for(int j = 0; j < count; j++)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}
