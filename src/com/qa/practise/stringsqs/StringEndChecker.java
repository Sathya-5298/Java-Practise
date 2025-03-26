package com.qa.practise.stringsqs;

public class StringEndChecker {

	public static void main(String[] args) 
	{
		String s1 = "Core Java";
		String s2 = "Java";
		System.out.println(s1.endsWith(s2));
		int count = 0;
		
		for(int i = s1.length() - 1, j = s2.length() - 1; j >= 0; i--, j--)
		{
			if(s1.charAt(i) == s2.charAt(j))
			{
				count++;
			}
		}
		if(count == s2.length())
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
	}

}
