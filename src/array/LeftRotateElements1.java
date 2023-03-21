package array;

public class LeftRotateElements1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};

        int n = 3;
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        System.out.println("Array after left rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
