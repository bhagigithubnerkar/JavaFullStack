package array;

import java.util.Scanner;

public class SubtractTwoMatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];


        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                a[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter the elements of second matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {

                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Subtraction of two matrices ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {

                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }

    }
}
