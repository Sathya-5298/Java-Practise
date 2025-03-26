package com.qa.java.parctise;

import java.util.UUID;

public class AlphaNumeric 
{
	public static void main(String[] args) 
	{
		String str = UUID.randomUUID().toString();
		
		System.out.println(str);
		
		String reqStr = str.replace("-", "");
		reqStr = str.substring(0,7);
		
		System.out.println(reqStr);
	}
}
