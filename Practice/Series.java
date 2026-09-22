class Series
{
	public static void main(String[] args)
	{
		int firstValue = 0;
		int secondValue = 1;
		int thirdValue = 0;
		for(int i = 0; i<8;i++)
		{
		  System.out.print(firstValue + " ");
		  thirdValue = firstValue + secondValue;
		  firstValue = secondValue;
		  secondValue = thirdValue;
		}
	}
}
		  
		  
			  
			
			