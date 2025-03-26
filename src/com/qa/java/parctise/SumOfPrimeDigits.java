package com.qa.java.parctise;

import java.util.Scanner;

public class SumOfPrimeDigits {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		
		while(num != 0)
		{
			int digit = num%10;
			System.out.print(digit + " ");
			if (digit % 3 == 0)
			{
				sum = sum + digit;
			}
			num = num / 10;
		}
		System.out.println("Sum is :" + sum);
		scn.close();
	}

}
