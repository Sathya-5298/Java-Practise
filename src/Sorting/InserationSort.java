package Sorting;

import java.util.Arrays;

public class InserationSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,2,9,8,1,0};
		int n = arr.length;
		
		for(int i = 0; i < n; ++i)
		{
			int j = i;
			
			while(j > 0 && arr[j - 1] > arr[j])
			{
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				
				j = j - 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
