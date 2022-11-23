package array;

public class LargestElement {
    public static void main(String[] args) {
        int array[] = new int[]{450, 340, 120, 730, 100};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Largest element in given array: " + max);
    }
}
