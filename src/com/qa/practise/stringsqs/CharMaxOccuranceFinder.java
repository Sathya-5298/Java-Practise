package com.qa.practise.stringsqs;

import java.util.Scanner;

public class CharMaxOccuranceFinder {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scn.next();
		int[] arr = new int[256];
		int max = 0;
		
		for(int i = 0; i < input.length(); i++)
		{
			arr[(int)input.charAt(i)]++;
		}
		
		for(int j = 1; j < arr.length; j++)
		{
			if(arr[j] > arr[max])
			{
				max = j;
			}
		}
		System.out.println("Maximun Char Occuared is : " + (char)max);
		scn.close();
	}
}
