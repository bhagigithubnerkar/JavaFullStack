package array;

public class AscendingOrderArray {
    public static void main(String[] args) {
        // Initialize array
        int[] array = new int[]{10, 12, 56, 45, 78};
        int cnt;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // sort array in ascending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    cnt = array[i];
                    array[i] = array[j];
                    array[j] = cnt;
                }
            }
        }
        System.out.println();

        // display elements of array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}

