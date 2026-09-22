// Demonstrate lifeTime of a variable
public class LifeTime
{
	public static void main(String[]args)
	{
		int x ;
		int y = 0;
		for(x = 0; x < 3; x++)
		{
			 int m = -1; // y is intialized each time block is entered
			System.out.println("m is: " + m); //this always prints -1
			m = 100;
			System.out.println("m is now: " + m);
		}
		
		for(x = 0; x < 3; x++)
		{
			 int m = -1; // y is intialized each time block is entered
			System.out.println("m is: " + m); //this always prints -1
			m = 100;
			System.out.println("m is now: " + m);
		}
		System.out.println("m is now: " + y);
	}
}