package com.qa.java.parctise;

public class SumOFDigits 
{
	public static void main(String[] args) 
	{
		System.out.println(sumOfDigits(1001));
	}
	
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		
		while(n > 0)
		{
			int temp = n % 10;
			sum = sum + temp;
			n = n/10;
		}
		return sum;	
	}
}
