// An improved version of the previous program.
class AutoArray
{
	public static void main(String[] args)
	{
	int i;
	int days = 0;
	int[] month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
	for(i=0; i <= 11; i++)
	{
		System.out.println("April has " + month_days[i] + " days. ");
    }	
	}
}