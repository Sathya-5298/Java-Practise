package com.qa.practise.stringsqs;

public class CompressedCharacterFrequency 
{
	public static void main(String[] args) 
	{
		String input = "aaaabbbccd";
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for(int i = 0; i < input.length(); i++)
		{
			if(i < input.length() - 1 && input.charAt(i) == input.charAt(i+1))
			{
				count++;
			}
			else
			{
				sb.append(input.charAt(i)).append(count);
				count = 1;
			}
		}
		System.out.println(sb);
	}
}
