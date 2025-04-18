package ArraysPractise;

import java.util.Arrays;

public class EvenOddSeperator {

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] res = new int[arr.length];
		
		int even = 0;
		int odd = arr.length - 1;
		
		for(int num : arr)
		{
			if(num % 2 == 0)
			{
				res[even++] = num;
			}
			else
			{
				res[odd--] = num;
			}
		}
		
		for(int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
		
		System.out.println(Arrays.toString(res));
	}

}
