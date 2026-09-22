class Box
{
	double width;
	double height;
	Box(double w, double h)
	{
		width = w;
	    height = h;
	}
	double volume()
	{
		return width * height;
	}
}
class BoxDemo11
{
	public static void main(String[] args)
	{
		Box mybox1 = new Box(10,10);
		Box mybox2 = new Box(5,5);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}
		
		
		