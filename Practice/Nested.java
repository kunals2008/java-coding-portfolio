class Nested
{
	public static void main(String[] args)
	{
		int i = 10;
		int j = 15;
		int k = 50;		
		int a = 2;
		int d = 5;
		int c = 1;
        int b = 7;
		if(i == 10)
		{
			if(j < 20)
			{
			 a = b;
			}
			if(k > 100)
			{
				c = d;
			}
			else
			{
				a = i;
			}
		}
		else
		{
			a = d;
		}
		System.out.println("value of a is " + a);
	}
}