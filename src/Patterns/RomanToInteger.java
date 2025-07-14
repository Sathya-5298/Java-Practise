package Patterns;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) 
	{
		String s = "IX";
		
		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		
		int result = 0;
		int previousValue = 0;
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			char currentChar = s.charAt(i);
			int currentValue = romanMap.get(currentChar);
			
			if(currentValue >= previousValue)
			{
				result += currentValue;
			}
			else
			{
				result -= currentValue;
			}
			previousValue = currentValue;
		}
		System.out.println("Integer format for " + s + " - " + result);
	}
}
