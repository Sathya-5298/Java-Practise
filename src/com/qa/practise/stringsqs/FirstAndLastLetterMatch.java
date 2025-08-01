package com.qa.practise.stringsqs;

public class FirstAndLastLetterMatch {

	public static void main(String[] args) 
	{
		String str = "Wow eye high level is the Java Test";
		
		String[] words = str.split(" ");
		
		System.out.println("Words with First And Last Letter Match are:");
		for(String word: words)
		{
			if(word.length() >= 2)
			{
				char firstLetter = word.charAt(0);
				char lastLetter = word.charAt(word.length() - 1);
				
				if(Character.toLowerCase(firstLetter) == Character.toLowerCase(lastLetter))
				{
					System.out.println(word);
				}
				
			}
		}
	}

}
