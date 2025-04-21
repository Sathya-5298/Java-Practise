package Patterns;

public class BlanacingBraces 
{
	public static void main(String[] args) 
	{
		String braces = "{{{}}}{}{}}}}{{";
		
		int open = 0;
		int close = 0;
		
		for(int i = 0; i < braces.length(); i++)
		{
			if(open >= close)
			{
				if(braces.charAt(i) == '{')
				{
					open++;
				}
				else if(braces.charAt(i) == '}')
				{
					close++;
				}
			}
		}
		if(open == close)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("UnBalanced");
		}
	}
}
