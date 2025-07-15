package com.qa.practise.stringsqs;

public class SepearationOfNumbersAndAlphabetsInString {

	public static void main(String[] args) 
	{
		String s = "52Sathya98";
		
		char[] ch = s.toCharArray();
		
		StringBuilder numbers = new StringBuilder();
		StringBuilder alphabets = new StringBuilder();
		
		
		for(char c: ch)
		{
			if(Character.isDigit(c)) 
			{
				numbers.append(c);
			}
			else if(Character.isAlphabetic(c))
			{
				alphabets.append(c);
			}
		}
		System.out.println(numbers.toString());
		System.out.println(alphabets.toString());
	}
}
