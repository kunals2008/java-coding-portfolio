class Box
{
	String printEven(int start,int end)
	{
	 for(int i = start;i <= end; i++)	 
	 {
        if(i % 2 == 0)
		{
          System.out.println(i);
		}			
	 }
	 return "done";
	}
	String printOdd(int start,int end)
	{
		for(int i = start;i <= end; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
		return "Odd nmbers are done";
	}
}
class BoxDemo7
{
	public static void main(String[] args)
	{
		int number = 5;
		int number2 = 15;		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		String val;
		String vol;
		 val = mybox1.printEven(number,number2);
		 System.out.println(val);
		 vol = mybox2.printOdd(number, number2);
		 System.out.println(vol);
	}
}
		
