package Sorting;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,5,9,8,6,7,1};
		int n = arr.length;
		
		int temp = 0;
		
		for(int j = 1; j < n; j++)
		{
			for(int i = 0; i < n - j; i++)
			{
				if(arr[i] > arr[i+1])
					{
						temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
