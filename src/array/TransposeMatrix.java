package array;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, r1, c1;
        System.out.println("Enter the rows & columns");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        int[][] array = new int[r1][c1];
        System.out.println("Enter matrix");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                array[i][j] = sc.nextInt();
                System.out.print("");
            }

        }
        System.out.println("The matrix before transpose");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The matrix after transpose");

        for (i = 0; i < c1; i++) {
            for (j = 0; j < r1; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
