class AC
{
	public static void main(String[] args)
	{
		int k = 0;
		int j = 1;
		int i = 0;
		int[] add = new int[6];
		for(i = 0;i<add.length;i++)
		{
			if(i < 2)
			{
			 k = i + j;
			add[i] = k;
			System.out.println(add[i]);
			}
			else
			{
				add[i] = add[i - 1] + add[i - 2];
				System.out.println(add[i]);
			}
		}
	}
}
			
			
			
		