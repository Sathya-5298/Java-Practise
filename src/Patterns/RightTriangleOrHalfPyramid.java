package Patterns;

public class RightTriangleOrHalfPyramid {

	public static void main(String[] args) 
	{
		int n = 6;
		
		for (int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
