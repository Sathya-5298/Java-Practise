package ArraysPractise;

import java.util.ArrayList;
import java.util.List;

public class RemainderOfEachNumberBy5 {

	public static void main(String[] args) 
	{
		int[] arr = {7, 10, 11, 16, 17, 15, 25, 30, 21, 26, 22};
		
		List<Integer> li0 = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();
		
		for(int num : arr)
		{
			int remainder = num % 5;
			
			if(remainder == 0)
			{
				li0.add(num);
			}
			else if(remainder == 1)
			{
				li1.add(num);
			}
			else if(remainder == 2)
			{
				li2.add(num);
			}
		}
		
		System.out.println("Remainder0:" + li0);
		System.out.println("Remainder1:" + li1);
		System.out.println("Remainder2:" + li2);
	}
}
