package com.qa.java.parctise;

public class SplitString {

	public static void main(String[] args) 
	{
		String str = "I love Selenium";
		String[] str1 = str.split(" ");
		
		for(String word: str1)
		{
			System.out.println(word);
		}
	}
}
