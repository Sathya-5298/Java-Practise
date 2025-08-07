package com.qa.practise.stringsqs;

public class ReorderWordsBasedonEvenOddCount {

	public static void main(String[] args) 
	{
		String input1 = "Learn Java Fast Today";
        String input2 = "Learn Java Fast Today Now";
		
		reorderWords(input1);
		reorderWords(input2);
	}
	
	private static void reorderWords(String s)
	{
		String[] str = s.split(" ");
		 int n = str.length;
		 
		 for(int  i = 0; i < n - 1; i += 2)
		 {
			 String temp = str[i];
			 str[i] = str[i + 1];
			 str[i + 1] = temp;
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 
		 for(int j = 0; j < n; j++)
		 {
			 sb.append(str[j]);
			 
			 if(j < n - 1)
			 {
				 sb.append(" ");
			 }
		 }
		 System.out.println(sb.toString());
	}
}
