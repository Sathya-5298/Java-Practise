package com.qa.practise.stringsqs;

public class EvenWordPrinterFromString {

	public static void main(String[] args) 
	{
		 String s = "Sky is blue and vast";
		 String[] words = s.split(" ");
		    
		    for(String word: words)
		    {
		        if(word.length() % 2 == 0)
		        {
		            System.out.println(word);
		        }
		    }
	}
}
