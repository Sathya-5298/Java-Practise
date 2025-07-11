package com.qa.practise.stringsqs;

import java.util.Arrays;

public class StringAnagarams {

	public static void main(String[] args) 
	{
		String s1 = "listen";
		String s2 = "silent";
		
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean b = Arrays.equals(ch1, ch2);
		System.out.println(b + " " + s1 + " and " + s2 + " are Anagarams ");
		
	}
}
