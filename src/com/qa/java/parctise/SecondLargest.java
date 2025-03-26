package com.qa.java.parctise;

import java.util.Arrays;
import java.util.List;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(2,5,9,8,8,7);
		System.out.println(FindSecondLargest(numbers));
	}
	
	public static int FindSecondLargest(List<Integer> input)
	{
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : input)
		{
			if(num > firstMax)
			{
				secondMax = firstMax;
				firstMax = num;
			}
			else if(num > secondMax && num != firstMax)
			{
				secondMax = num;
			}
		}
		return secondMax;
	}
}
