package com.qa.practise.stringsqs;

public class PrintNameInitials {

	public static void main(String[] args) 
	{
		String name = " Sathya Murthy Devalapalli";
		
		String[] nameParts = name.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String part: nameParts)
		{
			if(!part.isEmpty())
			{
				sb.append(part.charAt(0)).append(". ");
			}
		}
		
		System.out.println("Intials: " + sb.toString().trim());
	}
}
