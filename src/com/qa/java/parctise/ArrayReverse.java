package com.qa.java.parctise;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse 
{
	public static void main(String[] args) 
	{
		int [] inputArr = {2,5,9,8};
		reverseArray(inputArr);
		revArrayCollections(inputArr);
	}
	
	public static void reverseArray(int[] arr)
	{
		int temp = 0;
		int n = arr.length;
		
		for(int i = 0, j = n-1;i < j; i++, j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int a : arr)
		System.out.println(a);
		
		System.out.println("Reverse Array: " + Arrays.toString(arr));
	}
	
	public static void revArrayCollections(int[] arr1)
	{
		Collections.reverse(Arrays.asList(arr1));
		for(int b : arr1)
		{
			System.out.println(b);
		}
		
	}
}
