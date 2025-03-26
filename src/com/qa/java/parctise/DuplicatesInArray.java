package com.qa.java.parctise;

public class DuplicatesInArray {

	public static void main(String[] args) 
	{
		String[] str = {"asd","qwe","lkj","vbg","asd","qwe"};
		// int[] str = {0,1,2,1,2,5,9,8,8,9};
		
		for(int i = 0; i < str.length; i++)
		{
			for(int j = i+1; j < str.length; j++)
			{
				if (str[i] == str[j])
				{
					System.out.println(str[j]);
				}
			}
		}
	}
}
