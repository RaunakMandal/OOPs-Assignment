class Shape {
    void area(double r) {
        // calculate the area of circle given radius r
        // display the area of circle
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    void area(double b, double h) {
        // calculate the area of triangle given base 'b' and height 'h'
        // display the area of triangle
        System.out.println("Area of traingle: " + (b * h / 2));
    }

    public static void main(String args[]) {
        Shape cir = new Shape();
        // call the overloaded method area
        cir.area(5.6);
        cir.area(5.2, 10);
    }
}