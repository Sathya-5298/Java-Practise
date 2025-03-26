package com.qa.practise.stringsqs;

import java.util.Arrays;

public class ReverseOnlyLetters 
{
	public static void main(String[] args) 
	{
		String s = "52Sathya98";
		
		int left = 0;
		int right = s.length() - 1;
		
		char[] ch = s.toCharArray();
		
		while (left < right)
		{
			if(!Character.isLetter(ch[left]))
			{
				left++;
			}
			else if(!Character.isLetter(ch[right]))
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
