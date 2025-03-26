package com.qa.practise.stringsqs;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scn.next();
		System.out.println(stringPalindrome(input));
		scn.close();
	}
	
	public static String stringPalindrome(String input)
	{
		String output = "";
		
		for (int i = 0; i <= input.length() - 1; i++)
		{
			output = input.charAt(i) + output;
		}
		
		if (output.equals(input))
		{
			return output + " is a palindrome";
		}
		else
		{
			return output + " is not a palindrome";
		}
	}
}
