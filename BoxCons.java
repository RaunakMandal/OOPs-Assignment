class Box {
    double length, breadth, height, vol;

    Box() {
        length = breadth = height = 5.0;
    }

    Box(double val) {
        length = breadth = height = val;
    }

    Box(double len, double brd, double hgt) {
        length = len;
        breadth = brd;
        height = hgt;
    }

    void volume() {
        vol = length * breadth * height;
    }

    void display() {
        System.out.println("Volume of the box " + vol);
    }

    public static void main(String args[]) {

        System.out.print("Box1 : ");
        Box b1 = new Box();
        b1.volume();
        b1.display();

        System.out.print("Box2 : ");
        Box b2 = new Box(5.8);
        b2.volume();
        b2.display();

        System.out.print("Box3 : ");
        Box b3 = new Box(5, 10.5, 15.2);
        b3.volume();
        b3.display();

    }
}