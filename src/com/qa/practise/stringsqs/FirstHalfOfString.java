package com.qa.practise.stringsqs;

public class FirstHalfOfString 
{
	public static void main(String[] args) 
	{
		String a = "CoreJava";
		
		char[] letter = a.toCharArray();
		int n = letter.length;
		
		for(int i = 0; i < n/2; i++)
		{
			System.out.println(letter[i]);
		}
		
		System.out.println("LastHalfOfString");
		
		for(int i = n/2; i > 0; i++)
		{
			if(i < n)
			{
				System.out.println(letter[i]);
			}
		}
	}
}
