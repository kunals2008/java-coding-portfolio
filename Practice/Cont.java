class Cont
{
	public static void main(String[] args)
	{
		String [] name = {"ans","pessi","deep","ohio","kunal"};
		for(int i = 0; i<5;i++)
		{
			if(name[i] == "deep")
			{
				continue;
			}
			System.out.println(name[i]);
			
		}
	}
}