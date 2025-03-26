package com.qa.java.parctise;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 153;
		int arm = 0;
		int a = num;
		int b;
		while(num > 0)
		{
			b = num % 10;
			num = num/10;
			arm = arm + b * b* b;
		}
		if(arm == a)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}
}
