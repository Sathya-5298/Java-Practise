package com.qa.java.parctise;

public class ReverseNumber
{	
	public static void main(String[] args) 
	{
		int rev = 0;
		int num = 5298;
		int r;
		
		while (num > 0)
		{
			r = num % 10;
			rev = rev * 10 + r;
			num = num /10;
		}
		System.out.println(rev);
	}
}