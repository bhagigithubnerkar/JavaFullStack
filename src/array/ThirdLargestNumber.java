package array;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int array[] = new int[]{23, 56, 78, 90, 12};
        int cnt, size;
        size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    cnt = array[i];
                    array[i] = array[j];
                    array[j] = cnt;
                }
            }
        }
        System.out.println("Third Largest Number is : " + array[size - 3]);
    }
}
