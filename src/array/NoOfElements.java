package array;

import java.util.Scanner;

public class NoOfElements {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int[] array = new int[5];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}









