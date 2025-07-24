package ArraysPractise;

public class CheckLeaderNumInArray {

	public static void main(String[] args) 
	{
		int[] a = {12,98,11,5,2,9,8};
		
		int length = a.length;
		int maxRight = a[length - 1];
		
		System.out.println(maxRight);
		for(int i = length - 2; i >= 0; i--)
		{
			if(a[i] > maxRight)
			{
				maxRight = a[i];
				System.out.println(maxRight);
			}
		}
	}

}
