package com.qa.practise.stringsqs;

public class LengthOfLastWordString {

	public static void main(String[] args) 
	{
		String s = "TODO Auto-generated method stub";
		int count = 0;
		char input[] = s.toCharArray();
		int n = input.length;
		
		for(int i = n -1; i>=0; i--)
		{
			if(input[i] != ' ')
			{
				count = count + 1;
			}
			else
			{
				if(count > 0)
				{
					System.out.println(count);
					break;
				}
			}
		}
	}
}
