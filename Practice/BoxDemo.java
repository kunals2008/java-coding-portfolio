class Box
{
	int a = 0;
	void method1()
	{
		System.out.println("value of a = " + a);
	}
}
class BoxDemo
{
	public static void main(String[] args)
	{
		Box bx = new Box();
		Box bxl = new Box();
		bx.a = 10;
		bx.method1();
		bxl.a = 20;
		bxl.method1();
	}
}

