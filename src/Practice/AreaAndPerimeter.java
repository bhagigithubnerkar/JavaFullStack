package Practice;

import java.util.Scanner;

import static java.lang.System.out;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        double r = sc.nextDouble();
        double pi = 3.14;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        AreaAndPerimeter AP = new AreaAndPerimeter();
        int result = AP.calculateArea(n1, n2);
        int result1 = AP.calculatePerimeter(n1, n2);
        double result2 = AP.calculateArea(r, pi);
        double result3 = AP.calculatePerimeter(r, pi);
        double result4 = AP . calculateArea(a);
        int result5 = AP.calculatePerimeter(a);
        int result6 = AP.calculatePerimeter(a,b,c);
        System.out.println("Area of rectangle  = " + result);
        System.out.println("Perimeter of rectangle  = " + result1);
        System.out.println("Area of circle  = " + result2);
        System.out.println("Perimeter of circle  = " + result3);
        System.out.println("Area of an equilateral triangle  = "  + result4);
        System.out.println("Perimeter of an equilateral triangle = " + result5);
        System.out.println("Perimeter of triangle ="  + result6);
    }

    int calculateArea(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }
    int calculatePerimeter(int n1, int n2) {
        int result1 = 2 * (n1 + n2);
        return result1;
    }
    double calculateArea(double r, double pi) {
        double result2 = (pi * (r * r));
        return result2;
    }
    double calculatePerimeter(double r, double pi) {
        double result3 = (2 * pi * r);
        return result3;
    }

    double calculateArea(double a){
       double result4 = ((0.4325) * (a * a));
       return result4;

    }

    int calculatePerimeter(int a){
        int result5 = (3 * a);
        return result5;
    }

    int calculatePerimeter(int a,int b,int c){
        int result6 = (a + b + c);
        return result6;
    }



}
