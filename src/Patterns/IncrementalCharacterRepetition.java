package Patterns;

public class IncrementalCharacterRepetition {

	public static void main(String[] args) 
	{
		String str = "abcd";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			for(int j = 0; j <= i; j++)
			{
				sb.append(ch);
			}
		}
		System.out.println("Result is: " + sb.toString());
	}
}
