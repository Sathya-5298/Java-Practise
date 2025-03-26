package com.qa.java.parctise;

import java.util.Scanner;

public class DigitExtracter {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		while(num != 0)
		{
			int digit = num%10;
			System.out.println(digit);
			num = num / 10;
		}
		scn.close();
	}
}
