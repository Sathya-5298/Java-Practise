package com.qa.practise.stringsqs;

public class DuplicateInString 
{
	public static void main(String[] args) 
	{
		String s = "abcde";
		
		boolean found = false;
		
		for(int i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == s.charAt(i + 1))
			{
				found = true;
				break;
			}
		}
		System.out.println(found);
	}

}
