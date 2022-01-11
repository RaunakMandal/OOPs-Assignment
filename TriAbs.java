// Define a class triangle with an abstract method type_of_triangle(). Inherit
// this class into three subclasses Equilateral triangle, Isosceles triangle,
// and scalene triangle. The method type_of_triangle() will show the message “3
// sides are equal”, “2 sides are equal”, and “3 sides are different” for the
// three above-mentioned subclasses respectively.

abstract class Triangle {
    abstract void type_of_triangle();
}

class Equilateral extends Triangle {
    void type_of_triangle() {
        System.out.println("3 sides equal - Equilateral Triangle");
    }
}

class Isosceles extends Triangle {
    void type_of_triangle() {
        System.out.println("2 sides equal - Isosceles Triangle");
    }
}

class Scalene extends Triangle {
    void type_of_triangle() {
        System.out.println("3 sides are different - Scalene Triangle");
    }
}

class TriangleMain {
    public static void main(String[] args) {
        Triangle t1 = new Equilateral();
        t1.type_of_triangle();

        Triangle t2 = new Isosceles();
        t2.type_of_triangle();

        Triangle t3 = new Scalene();
        t3.type_of_triangle();
    }
}