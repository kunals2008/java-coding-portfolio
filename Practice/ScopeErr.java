// This program will not compile
public class ScopeErr
{
	public static void main(String[]args)
	{
		int bar = 1;
		{
			int m = 2;
		}
	}
}