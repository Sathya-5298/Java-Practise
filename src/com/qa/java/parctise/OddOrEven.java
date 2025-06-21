package com.qa.java.parctise;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scn.nextInt();

		oddOrEven(number);

		scn.close();
	}

	public static void oddOrEven(int num) 
	{
		if (num % 2 == 0) 
		{
			System.out.println(num + " is a Even number");
		} 
		else 
		{
			System.out.println(num + " is an Odd number");
		}
	}

}
