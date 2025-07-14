package ArraysPractise;

public class ArrayIsMonotonicOrNot {

	public static void main(String[] args) 
	{
		int[] a = {6,5,4,2,1};
		
		boolean increasing = true;
		boolean decreasing = false;
		
		for(int  i = 1; i <= a.length - 1; i++)
		{
			if(a[i - 1] < a[i])
			{
				decreasing = false;
			}
			else if(a[i - 1] > a[i])
			{
				increasing = false;
			}
		}
		
		if (increasing || decreasing)
		{
			System.out.println("Given Array is Monotonic");
		}
		else
		{
			System.out.println("Given Array is not Monotonic");
		}
	}
}
