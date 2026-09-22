class Whileseries
{
	public static void main(String[] args)
	{
		int firstvalue = 0;
		int secondvalue = 1;
		int thirdvalue = 0;
		int i = 0;
		while(i<8)
		{
			System.out.println(firstvalue);
			thirdvalue = firstvalue + secondvalue;
			firstvalue = secondvalue;
			secondvalue = thirdvalue;
			i++;
		}
    }
}

			
			
			