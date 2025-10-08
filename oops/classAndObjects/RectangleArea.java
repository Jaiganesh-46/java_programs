package oops.classAndObjects;

public class RectangleArea {
    double length;
    double breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Length: " + length + " | Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        RectangleArea r1 = new RectangleArea();
        r1.length = 5.5;
        r1.breadth = 3.0;

        RectangleArea r2 = new RectangleArea();
        r2.length = 7.2;
        r2.breadth = 4.1;

        r1.display();
        r2.display();
    }
}
