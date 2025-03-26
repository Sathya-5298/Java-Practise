package com.qa.practise.stringsqs;


public class WordFinderInString {

	public static void main(String[] args) 
	{
		String input = "I dont gold have gold";
		String compare = "gold";
		boolean found =false;
		
		input = input.toLowerCase();
		
		for(int i = 0; i < input.length(); i++)
		{
			int k = i;
			int j = 0;
			for( j = 0; j < compare.length(); j++)
			{
				if(input.charAt(k) != compare.charAt(j))
				{
					break;
				}
				k++;
			}
			if(j == compare.length())
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println(compare + " is found in given input");
		}
		else
		{
			System.out.println(compare + " is not found in given input");
		}
	}	
}
