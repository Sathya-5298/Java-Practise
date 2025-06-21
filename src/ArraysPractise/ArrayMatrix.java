package ArraysPractise;

public class ArrayMatrix 
{
	public static void main(String[] args) 
	{
		int m = 3;
		int n = 3;
		
		 int[][] arr = new int[m][n];
		 
		 for(int i = 0; i < m; i++)
		 {
			 for(int j = 0; j < n; j++)
			 {
				 arr[i][j] = i * 2;
			 }
		 }
		 
		 for(int i = 0; i < m; i++)
		 {
			 for(int j = 0; j < n; j++)
			 {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 for(int i = 0; i < m; i++)
		 {
			 for(int j = 0; j < n; j++)
			 {
				 if(i == j)
				 {
					 System.out.print(arr[i][j] + " ");
				 }
			 }
		 }
	}
}
