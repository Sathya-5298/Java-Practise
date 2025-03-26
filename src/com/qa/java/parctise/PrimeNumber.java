package com.qa.java.parctise;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scn.nextInt();
			if(isPrimeNumber(number))
			{
				System.out.println(number + " is a prime");
			}
			else
			{
				System.out.println(number + " is not a prime");
			}
			
			scn.close();
	}
	public static boolean isPrimeNumber(int num)
	{
		for (int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
