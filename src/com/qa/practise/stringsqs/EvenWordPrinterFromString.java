package com.qa.practise.stringsqs;

import java.util.StringTokenizer;

public class EvenWordPrinterFromString {

	public static void main(String[] args) 
	{
		String s = "TODO Auto-generated method stub";
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		
		while(tokenizer.hasMoreTokens())
		{
			String eachToken = tokenizer.nextToken();
			if(eachToken.length() % 2 == 0)
			{
				System.out.println(eachToken);
			}
		}
	}
}
