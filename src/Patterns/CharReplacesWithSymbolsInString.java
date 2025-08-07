package Patterns;

public class CharReplacesWithSymbolsInString 
{
	public static void main(String[] args) 
	{
		String input = "tomorrow";
		
		StringBuilder sb = new StringBuilder();
		int oCount = 0;
		
		for(char c : input.toCharArray())
		{
			if(c == 'o')
			{
				oCount++;
				for(int i = 0; i < oCount; i++)
				{
					sb.append("#");
				}
			}
			else
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
