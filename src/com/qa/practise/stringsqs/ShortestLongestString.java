package com.qa.practise.stringsqs;

import java.util.ArrayList;
import java.util.List;

public class ShortestLongestString 
{
	public static void main(String[] args) 
	{
		 String[] words = { "BMW", "RollsRoyce", "TATA", "Mahindra" };
		 
		 List<String> li = new ArrayList<String>();
		 
		 for(String word: words)
		 {
			 li.add(word);
		 }
		 
		 String shorter = li.get(0);
		 String longer = li.get(0);
		 
		 for(int i = 0; i < li.size(); i++)
		 {
			 if(shorter.length() > li.get(i).length())
			 {
				 shorter = li.get(i);
			 }
			 
			 if(longer.length() < li.get(i).length())
			 {
				 longer = li.get(i);
			 }
		 }
		 System.out.println("Shortest String is : " + shorter);
		 System.out.println("Longer String is : " + longer);
	}
}
