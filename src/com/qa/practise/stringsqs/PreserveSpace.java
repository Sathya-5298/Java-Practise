package com.qa.practise.stringsqs;

public class PreserveSpace {

	public static void main(String[] args) 
	{
		String str = "AWS Cloud Quest: Recertify Cloud Practitioner";
		
		int n = str.length();
		int start = 0;
		int end = n - 1;
		
		char[] ch = str.toCharArray();
		
		while(start < end)
		{
			if(ch[start] == ' ')
			{
				start++;
				continue;
			}
			else if(ch[end] == ' ')
			{
				end--;
				continue;
			}
			else
			{
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				
				start++;
				end--;
			}
		}
		System.out.println(ch);
	}
}
