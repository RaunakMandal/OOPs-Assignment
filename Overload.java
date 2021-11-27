class Shape {
    void area(double r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    void area(double b, double h) {
        System.out.println("Area of traingle: " + (b * h / 2));
    }

    public static void main(String args[]) {
        Shape cir = new Shape();
        cir.area(5.6);
        cir.area(5.2, 10);
    }
}