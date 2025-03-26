package com.qa.java.parctise;

public class SwapTwoNumbers 
{
	
	public static void main(String[] args) 
	{
		swapNumbers(52, 98);
		swapNumbersWithoutThirdVar(98, 52);
	}
	
	public static void swapNumbers(int a, int b)
	{
		int temp;
		System.out.println("Befor Swap: " + a +" "+ b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Sawap " + a + " " + b);
	}
	
	public static void swapNumbersWithoutThirdVar(int a, int b)
	{
		System.out.println("Befor Swap: " + a +" "+ b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Sawap " + a + " " + b);
	}

}
