package ArraysPractise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesArray 
{
	public static void main(String[] args) 
	{
		// int[] arr = {1, 2, 3, 4, 4, 5, 6, 1, 2, 7};
		
		String[] arr = {"asd","qwe","lkj","vbg","asd","qwe"};
		
		//  List<Integer> li = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 1, 2, 7);
		  
		//  li.stream().distinct().forEach(s -> System.out.println(s));
		 
		// LinkedHashSet<Integer> d = new LinkedHashSet<Integer>();
		
		LinkedHashSet<String> d = new LinkedHashSet<String>();
		   
	    for (int i = 0; i < arr.length; i++)
	    {
	    	d.add(arr[i]);
	    }
	    System.out.println(d);
	    
	    Iterator<String> itr = d.iterator();
		   
		   while(itr.hasNext())
		   {
		       System.out.println(itr.next());
		   }
	}
}
