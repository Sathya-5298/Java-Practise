package com.qa.java.parctise;

public class FindPairsWithTarget 
{
	public static void main(String[] args) 
	{
		int [] arr = {2,5,9,8,-2,1,7,0};
		int target = 8;
		
		findPairs(arr, target);
		
	}
	public static void findPairs(int[] arr, int target)
	{
		boolean pairfound = false;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.println("("+arr[i]+","+arr[j]+")");
					pairfound = true;
				}
			}	
		}
		if(!pairfound)
		{
			System.out.println("No pair found");
		}
	}
}
