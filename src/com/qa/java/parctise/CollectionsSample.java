package com.qa.java.parctise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsSample {

	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(0);
		li.add(1);
		li.add(3);
		li.add(9);
		li.add(7);
		li.add(6);
		
		System.out.println(li.reversed());
		
		Iterator<Integer> val = li.iterator();
		
		while(val.hasNext())
		{
			System.out.println( val.next());
		}
	}

}
