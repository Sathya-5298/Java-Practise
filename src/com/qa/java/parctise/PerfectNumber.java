package com.qa.java.parctise;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scn.nextInt();
		
		System.out.println(isPerfect(number));
		scn.close();

	}

	public static boolean isPerfect(int num)
	{
		int sum =  0;
		for (int i = 1; i < num; i++)
		{
			if(num % i == 0)
			{
				sum+= i;
			}
		}
		return sum == num;
	}
}
