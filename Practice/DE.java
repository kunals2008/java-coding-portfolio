public class DE
{
	public static void main(String[] args)
	{
		int i = 0;
		int k = 0;
		int j = 0;
		int[][] array = new int[4][4];
		for(i = 0;i<4;i++)
		{
			for(j=0;j<i+1;j++)
			{
				array[i][j] = k;
				k++;
			}
		}
		for(i = 0;i<4;i++)
		{
			System.out.println();
			for(j = 0; j<i+1;j++)
			{
			 System.out.print(array[i][j] + " ");
			}
			
		}
	}
}