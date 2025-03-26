package com.qa.java.parctise;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 11;
		int orginal = num;
		int revnum = 0;
		int temp;
		
		while(num != 0)
		{
			temp = num % 10;
			revnum = revnum * 10 + temp;
			num = num / 10;
		}
		
		if(orginal == revnum)
		{
			System.out.println(revnum + " is a palindrome");
		}
		else
		{
			System.out.println(revnum + " is not a palindrome");
		}	
	}
}
