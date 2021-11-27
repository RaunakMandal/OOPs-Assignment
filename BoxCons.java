class Box
{
double length, breadth, height, vol;
Box() 
{
length=10;
breadth=10;
height=10;
}
Box(double val){
 length = val;
 breadth = val;
 height = val;
}

Box(double len, double brd, double hgt) {
length = len;
breadth = brd;
height = hgt;
}

void volume()
{
vol = length*breadth*height;
}
void display()
{
System.out.println("Volume of the box "+vol);
}

public static void main(String args[])
{

System.out.println("Box1 : ");
Box b1 = new Box();
b1.volume();
b1.display();

System.out.println("Box2 : ");
Box b2 = new Box(5);
b2.volume();
b2.display();

System.out.println("Box3 : ");
Box b3 = new Box(5, 10, 15);
b3.volume();
b3.display();

}
}