package ArraysPractise;

import java.util.Arrays;

public class MaxProductTripletsInArray {

	public static void main(String[] args) 
	{
		int[] a = {-10,-3,5,7,-11};
		int n = a.length;
		
		maxProductTriplet(a);
		
		if(n < 3)
		{
			System.out.println("Length is incompatiable for triplets");
		}
		else
		{
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			
			int resultOne = a[n - 1]*a[n - 2]*a[n - 3];
			System.out.println(resultOne);
			
			int resultTwo = a[0]*a[1]*a[n - 1];
			System.out.println(resultTwo);
			
			System.out.println("MaxProductTripletsInArray is "+ Math.max(resultTwo, resultOne));
		}
	}
	
	public static void maxProductTriplet(int[] a)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int num : a)
		{
			if(num > max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = num;
			}
			else if(num > max2)
			{
				max2 = max3;
				max2 = num;
			}
			else if(num > max3)
			{
				max3 = num;
			}
			
			if(num < min1)
			{
				min2 = min1;
				min1 = num;
			}
			else if(num < min2)
			{
				min2 = num;
			}
		}
		
		int resultOne = max1*max2*max3;
		int resultTwo = min1*min2*max1;
		
		System.out.println("MaxProductTriplets without Sorting = " + Math.max(resultOne, resultTwo));
	}
}
