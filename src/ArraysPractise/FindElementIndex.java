package ArraysPractise;

import java.util.*;

public class FindElementIndex {

	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 9, 4, 5, 6, 7, 8, 9, 3};
		
		Scanner scn = new Scanner(System.in);
		int searchElement = scn.nextInt();
		
		// ArrayList<Integer> index = new ArrayList<Integer>();
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == searchElement)
			{
				System.out.println("Index of " + searchElement + " is at " + i);
				found = true;
			}
		}
		if(!found)
		{
			System.out.println("Elemnt not found");
		}
		
		scn.close();
	}

}
