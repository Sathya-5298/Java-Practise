package com.qa.java.parctise;

import java.util.Scanner;

public class SumOfEvenDigits {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			System.out.print(digit + " ");
			if(digit % 2 == 0)
			{
				evenSum = evenSum + digit;
			}
			else
			{
				oddSum = oddSum + digit;
			}
			num = num / 10;
		}
		System.out.println("\n" + evenSum);
		System.out.println(oddSum);
		scn.close();
	}
}
