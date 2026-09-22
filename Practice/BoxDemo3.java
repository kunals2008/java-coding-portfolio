class Box
{
	void method1()
	{
		int i = 2;
		for(i = 2; i<=10;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
class BoxDemo3
{
	public static void main(String[] args)
	{
		Box bc = new Box();
		bc.method1();
	}
}