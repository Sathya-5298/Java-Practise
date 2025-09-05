package Patterns;

public class PermutationsAndCombinationsOfString {

	public static void main(String[] args) 
	{
		String s = "ABC";
		String answer = "";
		permute(s, answer);
	}

	private static void permute(String s, String answer) 
	{
		if(s.length() == 0)
		{
			System.out.println(answer + " ");
		}
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			String s1 = s.substring(0, i);
			String s2 = s.substring(i + 1);
			String result = s1 + s2;
			permute(result, answer+ch);
		}
	}
}
