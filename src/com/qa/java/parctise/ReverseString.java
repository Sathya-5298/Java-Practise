package com.qa.java.parctise;

public class ReverseString {

	public static void main(String[] args) 
	{
		System.out.println(stringReverse("Hello World Sample"));
	}
	
	public static String stringReverse(String str)
	{
		String temp = "";
		for(int i = 0;i < str.length(); i++ )
		{
			char ch = str.charAt(i);
			temp = ch + temp;
		}
		return temp;
	}
}
