package javainterviewquestions;

import java.util.Scanner;

public class FactorialOfAnInteger {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial Of Given Number = " + (fact));

    }

}
