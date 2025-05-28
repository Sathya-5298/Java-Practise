package ArraysPractise;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) 
	{
		int[] arr = {2,5,1,9,9,8};
		//String[] arr = {"aaa","ssd","poi","hju","ewe"};
		int n = arr.length;
		int temp = 0;
		// String temp = "";
		
		for(int i = 0, j = n - 1; i < j; i++, j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
