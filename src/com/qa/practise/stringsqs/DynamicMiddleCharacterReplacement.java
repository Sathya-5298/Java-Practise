package com.qa.practise.stringsqs;

public class DynamicMiddleCharacterReplacement {

	public static void main(String[] args) 
	{
		String str = "tomorrows";
		char ch = '#';
		
		replacementChar(str, ch);
	}
	
	private static void replacementChar(String s, char c)
	{
		int len = s.length();
		
		System.out.println(len);
		
		if(len == 0)
		{
			System.out.println(s);
		}
		
		int mid = len/2;
		
		if(len % 2 == 0)
		{
			System.out.println(s.substring(0, mid - 1) + c + c + s.substring(mid + 1));
		}
		else
		{
			System.out.println(s.substring(0, mid) + c + s.substring(mid + 1));
		}
	}
}
