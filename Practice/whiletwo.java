class whiletwo
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 2;
		int k;
		while(j<=10)	
		{
		 i = 1;
		 while(i<=10)
		 {
		  k = i * j;
		  System.out.println(k);
		  i++;
		 }
		  System.out.println("");
		 j++;
		}
	}
}