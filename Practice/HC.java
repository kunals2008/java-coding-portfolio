class HC
{
	public static void main(String[]args)
	{
		int j = 1;
		int k = 0;
		int i = 0;
		int[]add = new int[6];
		for(i=0;i<6;i++)
		{
			if(i<2)
			{
		    k = j + k;
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
			