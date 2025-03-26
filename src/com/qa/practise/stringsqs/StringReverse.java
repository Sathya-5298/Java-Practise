package com.qa.practise.stringsqs;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scn.next();
		String output = "";
		
		for(int i = input.length() - 1; i >= 0; i--)
		{
			output = output + input.charAt(i);
		}
		System.out.println(output);
		scn.close();
		
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());
		
	}
}
