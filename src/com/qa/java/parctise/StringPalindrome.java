package com.qa.java.parctise;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("eye"));
	}
	public static boolean isPalindrome(String str)
	{
		int start = 0;
		int end = str.length() - 1;
		
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
