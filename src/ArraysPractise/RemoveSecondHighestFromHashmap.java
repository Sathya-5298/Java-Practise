package ArraysPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RemoveSecondHighestFromHashmap
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", 30);
		map.put("b", 10);
		map.put("c", 20);
		map.put("d", 40);
		map.put("e", 50);
		map.put("f", 15);
		
		List<Integer> values = new ArrayList<Integer>(map.values());
		
		Collections.sort(values);
		
		if(values.size() < 2)
		{
			System.out.println("No second highest element is present");
		}
		
		int secondHighest = values.get(values.size() - 2);
		
		map.values().removeIf(value -> value == secondHighest);
		
		System.out.println("Updated map after removal is: " + map);
	}
}
