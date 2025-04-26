package Patterns;

public class PyramidPattern 
{

	public static void main(String[] args) 
	{
		int n = 5;
		
		int space = n - 1;
		int star = 1;
		
		for(int i = 0; i < n; i++)
		{
			for(int k = 0; k < space; k++)
			{
				System.out.print(" " + " ");
			}
			
			for(int j = 0; j < star; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
			space--;
			star = star + 2;
		}
	}
}
