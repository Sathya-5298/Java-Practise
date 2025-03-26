package com.qa.java.parctise;

public class WordReverseString {

	public static void main(String[] args) 
	{
		String str = "Java is good programming langauge";
		String[] words = str.split(" ");
		String reverse = "";
		
		for(int i = 0; i < words.length; i++)
		{
			String word = words[i];
			String temp = "";
			char ch;
			for(int j = 0; j < word.length(); j++)
			{
				ch = word.charAt(j);
				temp = ch + temp;
			}
			reverse = reverse + temp + " ";
		}
		System.out.println(reverse);
	}
}
