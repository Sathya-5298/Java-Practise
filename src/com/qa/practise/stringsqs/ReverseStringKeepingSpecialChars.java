package com.qa.practise.stringsqs;

public class ReverseStringKeepingSpecialChars {

	public static void main(String[] args) 
	{
		String str = "Test123@345@";
		
		char[] ch = str.toCharArray();
		
		int left = 0;
		int right = ch.length - 1;
		
		while(left < right)
		{
			if(!Character.isLetterOrDigit(ch[left]))
			{
				left++;
			}
			else if(!Character.isLetterOrDigit(ch[right]))
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
		System.out.println(ch);
	}
}
