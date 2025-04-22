 package com.qa.java.parctise;

public class factorial {

	public static void main(String[] args) 
	{
		int fact = 1;
		int n = 5;
		
		for (int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
		System.out.println(factorialRecurssion(7));
	}
	
	public static int factorialRecurssion(int n)
	{
		if(n <= 1)
		{
			return 1;
		}
		else
		{
			return n * factorialRecurssion(n - 1);
		}
	}
}
