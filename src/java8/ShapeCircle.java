package java8;

import java.util.Scanner;

public interface ShapeCircle {
    void calculateArea(int radius);
}

class CircleImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        ShapeCircle shapeCircle = new ShapeCircle() {
            @Override
            public void calculateArea(int radius) {
                System.out.println("Area " + 3.14 * radius * radius);
            }
        };
        shapeCircle.calculateArea(radius);

        // lambda ex
        ShapeCircle s = (radius1) -> {
            System.out.println("Area in lambda" + 3.14 * radius1 * radius1);

        };
        s.calculateArea(radius);
    }

}
