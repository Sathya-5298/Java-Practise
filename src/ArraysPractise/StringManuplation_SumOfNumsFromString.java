package ArraysPractise;

public class StringManuplation_SumOfNumsFromString {

	public static void main(String[] args) 
	{
		String input ="12abc34xyz56lmn9";
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		
		for(char c : input.toCharArray())
		{
			if(Character.isDigit(c))
			{
				sb.append(c);
			}
			else
			{
				if(sb.length() > 0)
				{
					sum = sum + Integer.parseInt(sb.toString());
					sb.setLength(0);
				}
			}
		}
		
		if(sb.length() > 0) // it will execute only when numbers are at the end!!
		{
			sum = sum + Integer.parseInt(sb.toString());
		}
		
		System.out.println(sum);
	}
}
