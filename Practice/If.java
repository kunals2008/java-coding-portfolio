public class If
{
	public static void main(String[]args)
	{
		int x;
		int y;
		x = 10;
		y = 20;
		
		if(x < y)
		{
			System.out.println("x is less than y");
		}
	    x = x * 2;
		if(x == y)
		{
			System.out.println("x now equal to y");
		}
		x = x * 2;
		if(x > y)
		{
			System.out.println("x now greater than y");
		}
		// This wont display anything
		if(x == y)
		{
			System.out.println("you wont see this");
		}
	}
}
		  
			