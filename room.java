class Room
{
	double height,length,breadth;
	void set_values(double h,double l,double b)
	{
		height = h;
		length = l;
		breadth = b;
	}
	double volume()
	{
		return length*breadth*height;
	}
}

class Room_demo
{
	public static void main(String args[])
	{
		Room room1 = new Room();
		room1.set_values(10,10,10);
		System.out.println("Volume is: "+room1.volume());	
	}
}
