package com.qa.practise.stringsqs;

public class StringVowelsCount {

	public static void main(String[] args) 
	{
		String s = "TODO Auto-generated method stub";
		
		int vowels = 0;
		int consonants = 0;
		
		for(int i =0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || 
					s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
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
	}
}
