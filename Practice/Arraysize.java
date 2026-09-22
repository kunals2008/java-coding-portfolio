class Arraysize
{
	public static void main(String[] args)
	{
		int[] nums = new int[10];	
		for(int i = 0; i< nums.length;i++)
		{
			int j=1;
			j=j+i;
			nums[i]=j;
			System.out.println(nums[i]);
		}			
		System.out.println("array length is "+ nums.length);	
    }
}	