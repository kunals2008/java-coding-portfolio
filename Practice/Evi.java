class Evi
{
	public static void main(String[] args)
	{
		int i = 0;
		int[] total = {1,2,3,4,5,6,7,8,9,10	};
		do
        {
           System.out.println(total[i]);
		   i++;
		   if(i==6)
		   {
			   break;
		   }	
        }	
       while(i<10);		   
	}
}