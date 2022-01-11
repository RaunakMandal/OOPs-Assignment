import java.util.Scanner;

abstract class Figure {
    double x, y;

    Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();
}

class Rectangle extends Figure {
    Rectangle(double l, double b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of Rectangle is: " + (x * y));
    }
}

class Triangle extends Figure {
    Triangle(double h, double b) {
        super(h, b);
    }

    void area() {
        System.out.println("Area of Triangle is: " + ((x * y) / 2));
    }
}

class FigClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of Rectangle: ");
        Figure rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        rectangle.area();
        System.out.print("Enter height and base of Triangle: ");
        Figure triangle = new Triangle(sc.nextDouble(), sc.nextDouble());
        triangle.area();
    }
}