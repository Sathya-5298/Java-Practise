package com.qa.practise.stringsqs;

public class CheckStringPangrams {

	public static void main(String[] args) 
	{
		String s = "The quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
		boolean result = checkPangram(s);
		
		if(result)
		{
			System.out.println(s + "-is a pangram");
		}
		else
		{
			System.out.println(s + "-is not a pangram");
		}
	}
		
		private static boolean checkPangram(String s)
		{
			if (s.length() < 26)
			{
				return false;
			}
			
			for(int i = 'a'; i < 'z'; i++)
			{
				if(s.indexOf(i) < 0)
				{
					return false;
				}
			}
			return true;
	}
}
