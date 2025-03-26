package com.qa.java.parctise;

import java.util.Scanner;

public class ExtractWordString {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		String str = "I love Java";
		String extract = scn.next();
		
		if(str.contains(extract))
		{
			int x = str.indexOf(extract);
			System.out.println(x);
			String y = str.substring(x, x+(extract.length()));
			
			System.out.println(y);
		}
		scn.close();
	}

}
