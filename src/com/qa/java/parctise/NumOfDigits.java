package com.qa.java.parctise;

public class NumOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int a = 0;
		
		while (num > 0)
		{
			num = num /10;
			a++;
		}
	System.out.println(a);
	}
}
