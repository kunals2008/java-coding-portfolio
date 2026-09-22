class Box
{
	int add(int number1, int number2, int number3)
	{
		int a = number1 + number2 + number3;
		return a;
	}
}
class Hi
{
	int multiply(int number1, int number2, int number3)
	{
		int a = number1 * number2 * number3;
		return a;
	}
}
class hello
{
	int subtract(int number1, int number3)
	{
		int a = number1 - number3;
		return a;
	}
}
class BoxDemo8
{
	public static void main(String[]args)
	{
		int number1 = 5;
		int number2 = 5;
		int number3 = 4;
		int val;
		int vol;
		int sub;
		Box mybox1 = new Box();
		val = mybox1.add(number1,number2,number3);
		System.out.println("Adding value is = " + val);
		Hi mybox2 = new Hi();
		vol = mybox2.multiply(number1,number2,number3);
		System.out.println("multiplication value is = " + vol);
		hello mybox3 = new hello();
		sub = mybox3.subtract(number1,number3);
		System.out.println("Subtraction value is = " + sub);
	}
}
		