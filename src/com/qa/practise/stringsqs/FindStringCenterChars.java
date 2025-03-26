package com.qa.practise.stringsqs;

public class FindStringCenterChars {

	public static void main(String[] args) 
	{
		String s = "CoreJava";
		int len = s.length();
		
		if(len % 2 == 0)
		{
			System.out.println(s.substring(len/2-1, len/2+1));
		}
		else
		{
			System.out.println(s.substring(len/2, len/2+1));
		}
	}
}
