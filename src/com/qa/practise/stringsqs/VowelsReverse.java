package com.qa.practise.stringsqs;

import java.util.Arrays;

public class VowelsReverse 
{
	public static void main(String[] args) 
	{
		String s = "Hello";
		String vowels = "aeiouAEIOU";
		
		int left = 0;
		int right = s.length() - 1;
		
		char[] ch = s.toCharArray();
		
		while (left < right)
		{
			if(vowels.indexOf(ch[left]) == -1)
			{
				left++;
			}
			else if(vowels.indexOf(ch[right]) == -1)
			{
				right--;
			}
			else
			{
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(ch));
		System.out.println("Output " + new String(ch));
	}

}
