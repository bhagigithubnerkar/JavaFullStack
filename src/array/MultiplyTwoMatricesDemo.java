package array;

import java.util.Scanner;

public class MultiplyTwoMatricesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, r1, r2, c1, c2;
        int[][] Mat_1 = new int[3][3];
        int[][] Mat_2 = new int[3][3];
        int[][] product = new int[3][3];
        // for matrix 1
        System.out.println("Enter the rows of Matrix 1");
        r1 = sc.nextInt();
        System.out.println("Enter the columns of Matrix 1");
        c1 = sc.nextInt();

        // for Matrix 2
        System.out.println("Enter the rows of Matrix 2");
        r2 = sc.nextInt();
        System.out.println("Enter the columns of Matrix 2");
        c2 = sc.nextInt();

        System.out.println("Enter the elements of Matrix 1:");
        // Input first matrix elements from user
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                Mat_1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of Matrix 2:");
        // Input second matrix elements from user
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                Mat_2[i][j] = sc.nextInt();
            }
        }

        // Multiply two matrices
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                for (k = 0; k < c2; k++) {
                    product[i][j] += Mat_1[i][k] * Mat_2[k][j];
                }
            }
        }

        // printing product matrix
        System.out.println("Product Matrix");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

}
