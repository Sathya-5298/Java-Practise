package com.qa.practise.stringsqs;

public class StringVowelsCount {

	public static void main(String[] args) 
	{
		String s = "TODO Auto-generated method stub";
		
		int vowels = 0;
		int consonants = 0;
		
		for(char ch : s.toCharArray())
		{
			if(isVowels(ch))
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
		
		
		String vowel = "aeiouAEIOU";
		char[] ch = s.toCharArray();
		int count = 0;
		
		for(char c: ch)
		{
			if(vowel.indexOf(c) != -1)
			{
				count++;
			}
		}
		System.out.println("VowelsCount:" + count);
	}
	
	public static boolean isVowels(char ch)
	{
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' ||
				ch == 'i' || ch == 'o' || ch == 'u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
