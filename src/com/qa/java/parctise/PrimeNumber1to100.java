package com.qa.java.parctise;

public class PrimeNumber1to100 {

	public static void main(String[] args) 
	{
		int n, i;
		
		for(n = 1; n <= 10; n++)
		{
			for( i = 2; i <= n/2; i++)
			{
				if(n % i == 0)
				{
					break;
				}
			}
			if(i > n/2)
			{
				System.out.println(n + " is a prime");
			}
			else
			{
				System.out.println(n + " is not a prime");
			}
		}
	}
}
