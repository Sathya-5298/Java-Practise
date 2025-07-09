package ArraysPractise;

public class FindMissingNumWithXOR 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,6,7};
		int missingNum = 0;
		
		for(int num: arr)
		{
			missingNum = missingNum ^ num;
		}
		System.out.println(missingNum);
	}
}
