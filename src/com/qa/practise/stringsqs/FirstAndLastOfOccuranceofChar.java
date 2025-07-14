package com.qa.practise.stringsqs;

public class FirstAndLastOfOccuranceofChar {

	public static void main(String[] args) 
	{
		String s = "Sathya Murthy";
		
		int firstIndex = -1;
		int lastIndex = -1;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 't')
			{
				firstIndex = i;
				break;
			}
		}
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			if(s.charAt(i) == 't')
			{
				lastIndex = i;
				break;
			}
		}
		
		System.out.println(firstIndex);
		System.out.println(lastIndex);
	}
}
