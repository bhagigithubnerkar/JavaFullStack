package Common;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Addition = " + (n1 + n2));
        System.out.println("Subtraction = " + (n1 - n2));
        System.out.println("Multiplication = " + (n1 * n2));
        System.out.println("Division = " + (n1 / n2));
        System.out.println("Modulo = " + (n1 % n2));

    }
}
