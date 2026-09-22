class Box
{
	int square(int i)
	{
		return i * i;
	}
}
class Java
{
	public static void main(String[] args)
	{
		
		int x, y;
		Box mybox = new Box();
		x = mybox.square(5);
		System.out.println(x);
		x = mybox.square(9);
		System.out.println(x);
		y = 2;
		x = mybox.square(y);
		System.out.println(x);
	}
}
		