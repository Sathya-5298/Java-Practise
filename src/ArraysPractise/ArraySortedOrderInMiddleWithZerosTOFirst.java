package ArraysPractise;

import java.util.Arrays;

public class ArraySortedOrderInMiddleWithZerosTOFirst {

	public static void main(String[] args) 
	{
		// Input [1,3,1,0,2,1,4,6,8,7,9,0,0,0,9]
		// Output [0,0,0,0,2,3,4,5,6,7,8,9,9,1,1,1]
		
		int[] arr = {1,3,1,0,2,1,4,6,8,7,9,0,0,0,9};
		
		Arrays.sort(arr);
		
		int[] result  = new int[arr.length];
		
		int left = 0;
		int right = arr.length - 1;
		
		for(int num : arr)
		{
			if(num == 0)
			{
				result[left++] = num;
			}
			else if(num == 1)
			{
				result[right--] = num;
			}
			else
			{
				result[left++] = num;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		for(int num : result)
		{
			System.out.println(num);
		}
		
		
	}
}
