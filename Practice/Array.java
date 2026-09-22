//Demonstrate a one-dimensional array.
class Array
{
	public static void main(String[] args)
	{
		int[] month_days;
		int total;
		month_days = new int[12];
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 30;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		System.out.println("April has " + month_days[3] + " days. ");
		total = month_days[0] + month_days[1] + month_days[2] + month_days[3] + month_days[4] + month_days[5] + month_days[6] + month_days[7] + month_days[8] + month_days[9] + month_days[10] + month_days[11];
        System.out.println("total is " + total);		
	}
}
 