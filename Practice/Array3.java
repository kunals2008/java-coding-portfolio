class Array3
{
	public static void main(String[] args)
	{
		int[][]nums = new int[4][4];
		int i = 0;
		int k = 0;
		int j = 0;
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				nums[i][j] = k;
				k++;
	        }
		}
		for(i=0;i<4;i++)
		{
		 System.out.println();
			for(j=0;j<=i;j++)
			{
				System.out.print(nums[i][j] + " ");
			}
		}
	}
}
			
		
		