package com.qa.practise.stringsqs;

public class StringCountOrLength {

	public static void main(String[] args) 
	{
		String s = "TODO Auto-generated method stub";
		
		int count  = 0;
		
		while(true)
		{
			try
			{
				s.charAt(count);
				count++;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(count);
				break;
			}
		}
	}
}
