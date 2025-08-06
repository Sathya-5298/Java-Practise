package ArraysPractise;

public class MissingNumInSortedArray {

	public static void main(String[] args) 
	{
		 int[] input = {1,2,3,4,5,6,7,8,10};
		 int  n = input.length + 1;
		 
		 int total = n*(n + 1)/2;
		 int sum = 0;
		 
		 for(int num : input)
		 {
			 sum = sum + num;
		 }
		 int missingNumber = total - sum;
		 System.out.println(missingNumber);
	}
}
