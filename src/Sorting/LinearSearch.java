package Sorting;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,2,9,8,1,0};
		int n = arr.length;
		int num = 33;
		boolean b = false;
		
		for (int i = 0; i < n; i++) 
		{
			if(num == arr[i])
			{
				System.out.println("Index is "+ i);
				b = true;
			}
		}
		
		if(b)
		{
			System.out.println(num + " is found in Array");
		}
		else
		{
			System.out.println(num + " is not found in Array");
		}
	}
}
