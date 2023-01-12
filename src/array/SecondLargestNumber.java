package array;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int array[] = new int[]{570, 340, 200, 780, 140};
        int cnt, size;
        size = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    cnt = array[i];
                    array[i] = array[j];
                    array[j] = cnt;

                }
            }
        }
        System.out.println("Second Largest Number = " + array[size - 2]);

    }
}
