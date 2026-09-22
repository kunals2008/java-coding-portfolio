class Nestedwsitch
{
	public static void main(String[] args)
	{
	int i = 0;
	int a = 1;
	switch(i)
	 {
		case 0:
		switch(a)
		{
			case 0:
			System.out.println("a is 0");
			break;
			case 1:
			System.out.println("a is 1");
		    break;
		}
	break;
	case 1:
	System.out.println("i is 2");
	 }
	}
}
	
			