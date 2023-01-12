package array;

public class DescendingOrderArray {
    public static void main(String[] args) {
        // Initialize array
        int[] array = new int[]{100, 200, 576, 780, 923};
        int cnt;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // sort array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] < array[j]) {
                    cnt = array[i];
                    array[i] = array[j];
                    array[j] = cnt;
                }
            }
        }
        System.out.println();

        // Display elements of an array in descending order
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
