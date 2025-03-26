package ArraysPractise;

public class MiniPeak {

	public static void main(String[] args) 
	{
		int[] arr = {2,5,1,9,9,8};
		int n = arr.length;
		
		for(int i = 1; i < n - 1; i++)
		{
			if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
			{
				System.out.println(arr[i]);
			}
		}
	}
}
