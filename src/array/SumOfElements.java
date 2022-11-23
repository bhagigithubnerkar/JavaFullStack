package array;

public class SumOfElements {
    public static void main(String[] args) {
        int array[] = new int[]{12, 34, 20, 30, 16};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all elements in given array: " + sum);
    }
}
