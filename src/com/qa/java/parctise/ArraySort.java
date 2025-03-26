package com.qa.java.parctise;

import java.util.Arrays;

public class ArraySort 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,7,6,8,9,3,4,5};
		int size = arr.length;
		int temp =0;
		
		for (int i = 0; i < size; i++)
		{
			for(int j = i+1; j < size; j++)
			{
				if(arr[i] > arr[j]) // ascending (>) and descending(<)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nLargest: " + arr[size -1]); //Largest in array
		System.out.println("Smallest: " + arr[0]); // smallest in array
	}

}
