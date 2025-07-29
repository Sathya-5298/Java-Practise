package com.qa.practise.stringsqs;

public class SortStringByLength {

	public static void main(String[] args) 
	{
		String str = "TODO Auto-generated method stub";
		
		String[] arr = str.split(" ");
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i].length() > arr[j].length())
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(String output: arr)
		{
			System.out.print(output + " ");
		}
	}

}
