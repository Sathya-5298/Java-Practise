package ArraysPractise;

public class MaxAndMinArray {

	public static void main(String[] args) 
	{
		int[] arr = {2,5,1,9,7,8};
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			else if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max Value-" + max + " Min Value-" + min);
	}
}
