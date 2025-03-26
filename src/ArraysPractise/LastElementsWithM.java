package ArraysPractise;

public class LastElementsWithM {

	public static void main(String[] args) 
	{
		int[] arr = {2,5,1,9,7,8};
		int n = arr.length;
		int m = 3;
		
		if(m < n)
		{
			for(int i = n - m; i < n; i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("M is out of length");
		}
	}
}
