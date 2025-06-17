package ArraysPractise;

public class MissingNumInSortedArray {

	public static void main(String[] args) 
	{
		int[] arr = {2,1,0,4};
		
		int n = arr.length;
		
		int total = n*(n + 1)/2;
		
		for(int num : arr)
		{
			total -= num;
		}
		System.out.println(total + " is missing in array");
	}
}
