package com.qa.practise.stringsqs;

public class ReverseOnlyVowels {

	public static void main(String[] args) 
	{
		String s = "HelloWorld";
		String vowels = "aeiouAEIOU";
		
		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		
		while(left < right)
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
		System.out.println("Output is: " + new String(ch));
	}
}
