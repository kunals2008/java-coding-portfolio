class H
{
	public static void main(String[] args)
	{
		int j = 0;
		int k = 0;
		int i = 0;
		int[] array = new int[7];
		for(i=0;i<array.length;i++)
		{
			k++;
			j= k * 3;
			array[i]=j;
			System.out.println(array[i]);
		}
	}
}