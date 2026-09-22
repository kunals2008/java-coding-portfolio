class House
{
	House()
	{
		System.out.println("my name is");
	}
	House(String name)
	{
		System.out.println("my name is there");
	}
	House(int count)
	{
		System.out.println("counter is" + count);
	}
}
class Home
{
	public static void main(String[] args)
	{
		House ho = new House();
	}
}