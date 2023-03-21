package java8;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorDemo {
    public static void main(String[] args) {
        double a, b, result;
        int ch, condition;


        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");


            ch = sc.nextInt();

            System.out.println("Enter First Number");
            a = sc.nextDouble();
            System.out.println("Enter Second Number");
            b = sc.nextDouble();

            result = sc.nextDouble();


            switch (ch) {
                case 1:
                    BiFunction<Double, Double, Double> biFunction = Double::sum;
                    System.out.println("The sum of a and b = " + biFunction.apply(12d, 6d));
                    break;

                case 2:
                    BiFunction<Double, Double, Double> biFunction1 = (a1, b1) -> a1 - b1;
                    System.out.println("The subtraction of a1 and b1 =" + biFunction1.apply(12d, 6d));
                    break;


            }
            condition = sc.nextInt();
        } while (condition == 1);

    }
}

