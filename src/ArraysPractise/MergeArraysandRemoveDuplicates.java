package ArraysPractise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeArraysandRemoveDuplicates {

	public static void main(String[] args) 
	{
		int[] a = {1, 2, 4, 5, 5};
        int[] b = {8, 8, 9, 7};
        
        int[] c = new int[a.length + b.length];
        
        int index = 0;
        
        for(int num : a)
        {
        	c[index] = num;
        	index++;
        }
        
        for(int num : b)
        {
        	c[index] = num;
        	index++;
        }
        
        System.out.println(Arrays.toString(c));
        
        Set<Integer> uniques = new LinkedHashSet<Integer>();
        
        for(int num : c)
        {
        	uniques.add(num);
        }
        System.out.println(uniques);
	}

}
