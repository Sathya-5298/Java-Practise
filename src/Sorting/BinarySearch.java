package Sorting;

import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,2,9,8,1,0,7};
		int num = 7;
		int low = 0;
		int high = arr.length -1;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if (arr[mid] == num)
			{
				System.out.println(mid);
			}
			else if(arr[mid] < num)
			{
				low = mid + 1;
				System.out.println(low);
			}
			else
			{
				high = mid - 1;
				System.out.println(high);
			}
			break;
		}
		
	}
}
