package exceptionhandling;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        try {
            int no = 12 / d;
            System.out.println(no);
        } catch (NullPointerException e) {
            System.out.println(e);

        } finally {
            System.out.println("in finally block");
        }
        System.out.println("Remaining code");
    }
}
