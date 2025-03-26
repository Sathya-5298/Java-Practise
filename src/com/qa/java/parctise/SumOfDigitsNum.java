package com.qa.java.parctise;

import java.util.Scanner;

public class SumOfDigitsNum {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		
		while(num != 0)
		{
			int digit = num%10;
			sum = sum + digit;
			System.out.println(digit);
			num = num / 10;
		}
		System.out.println(sum);
		scn.close();
	}
}
