package exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        try {
            System.out.println(5 / sc.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("Please enter not zero");
        }
        System.out.println("Rest of the code");

    }
}
