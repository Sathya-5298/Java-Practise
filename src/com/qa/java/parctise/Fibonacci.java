package com.qa.java.parctise;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int num = 10;
	//	int first = 0;
	//	int second = 1;
	//	int temp;
		
		for(int i = 1; i <= num; i++)
		{
			// System.out.println(first + " ");
			// temp = first + second;
			// first = second;
			// second = temp;	
			
			System.out.println(fibonacciRecurssion(i));
		}
	}
	
	private static int fibonacciRecurssion(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else
		{
			return fibonacciRecurssion(n - 1) + fibonacciRecurssion(n - 2);
		}
	}
}
