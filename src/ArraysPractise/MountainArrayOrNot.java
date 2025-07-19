package ArraysPractise;

public class MountainArrayOrNot {

	public static void main(String[] args) 
	{
		int[] a = {1,2,4,6,5,3,0};
		System.out.println(checkMountainArray(a));
	}

	private static boolean checkMountainArray(int[] a) 
	{
		if(a.length < 3)
		{
			return false;
		}
		
		int i = 0;
		while(i + 1 < a.length && a[i] < a[i + 1])
		{
			i++;
		}
		
		while(i + 1 < a.length && a[i] > a[i + 1])
		{
			i++;
			
		}
		
		if(a.length - 1 == i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
