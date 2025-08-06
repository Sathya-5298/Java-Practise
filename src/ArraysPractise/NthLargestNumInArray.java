package ArraysPractise;

import java.util.Arrays;

public class NthLargestNumInArray {

	public static void main(String[] args) 
	{
		int[] arr = {98,52,3,2,42,23,25};
		
		int n = 9;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i  + 1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		if(n <= arr.length)
		{
			System.out.println(n + " Largest Element is: " + arr[n - 1]);
		}
		else
		{
			System.out.println("N is out of the arr length");
		}
	}

}
