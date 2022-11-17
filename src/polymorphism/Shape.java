package polymorphism;


public class Shape {
    float calculateArea() {
        System.out.println("calculateArea");
        return calculateArea();
    }
}
class Circle extends Shape {
    int radius = 2;
    float Area;
    @Override
    float calculateArea() {
        System.out.println("Area of Circle =" + (3.14 * radius * radius));
        return Area;
    }
}
class Triangle extends Shape {
    int base = 5;
    int height = 3;
    float Area;
    @Override
    float calculateArea() {
        System.out.println("Area of Triangle =" + (0.5 * base * height));
        return Area;
    }
}
class Square extends Shape {
    int side = 4;
    float Area;
    @Override
    float calculateArea() {
        System.out.println("Area of Square =" + (side * side));
        return Area;
    }
}
class Rectangle extends Shape {
    int length = 6;
    int width = 8;
    float Area;
    @Override
    float calculateArea() {
        System.out.println("Area of Rectangle =" + (length * width));
        return Area;
    }
}

class ShapeImpl {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
        Shape shape1 = new Triangle();
        shape1.calculateArea();
        Shape shape2 = new Square();
        shape2.calculateArea();
        Shape shape3 = new Rectangle();
        shape3.calculateArea();

    }
}
