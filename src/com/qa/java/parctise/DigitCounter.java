package com.qa.java.parctise;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 0;
		
		while(num != 0)
		{
			count++;
			num = num / 10;
		}
		System.out.println("Total Digits are- " + count);
		scn.close();
	}

}
