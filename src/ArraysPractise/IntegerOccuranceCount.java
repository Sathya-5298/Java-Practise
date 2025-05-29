package ArraysPractise;

import java.util.HashMap;
import java.util.Map;

public class IntegerOccuranceCount 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,3,2,1,5,6,9,1,2,0};
		
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		
		for(int a : arr)
		{
			if(iMap.containsKey(a))
			{
				iMap.put(a, iMap.get(a) + 1);
			}
			else
			{
				iMap.put(a, 1);
			}
		}
		System.out.println("Occurance: " + iMap);
	}
}
