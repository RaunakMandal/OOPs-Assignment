class Box
{
	double length, breadth, height, vol;
	Box() // non parameterized constructor
	{
		length = 10;
		breadth = 10;
		height = 10;
	}
	Box(double value)
	{
		length=breadth=height=value;
	}
	Box(double l,double b, double h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	// write the other parameterized constructors
	void volume()
	{
		vol = length * breadth * height;
	}
	void display()
	{
		System.out.println("Volume of the box" + vol);
	}
	public static void main(String args[])
	{
		// create three objects while using one the above constructor
		// use hard coded value for passing parameter, no need to take input from
		// command prompt
		// using each object call the volume and display method
		System.out.println("Box 1: ");
		Box box1 = new Box();
		box1.volume();
		box1.display();
		System.out.println("Box 2: ");
		Box box2 = new Box(3);
		box2.volume();
		box2.display();
		System.out.println("Box 3: ");
		Box box3 = new Box(1,2,3);
		box3.volume();
		box3.display();
	}
}
