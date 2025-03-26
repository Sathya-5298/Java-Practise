package com.qa.java.parctise;

import java.util.Scanner;

public class CreditCardIssue {

	public static void main(String[] args) 
	{
		System.out.println("Enter Credit Score");
		Scanner scn = new Scanner(System.in);
		int creditScore = scn.nextInt();
		
		if(creditScore < 400 && creditScore > 850)
		{
			System.out.println("Invalid Score");
		}
		else if(creditScore >= 400 && creditScore < 600)
		{
			System.out.println("Silver Card");
		}
		else if(creditScore >= 600 && creditScore < 800)
		{
			System.out.println("Gold Card");
		}
		else
		{
			System.out.println("Platnium Card");
		}
		scn.close();
	}
}
