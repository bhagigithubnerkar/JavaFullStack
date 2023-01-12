package array;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        // declaration
        int[] array;

        //instantiate
        array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }


    }
}

