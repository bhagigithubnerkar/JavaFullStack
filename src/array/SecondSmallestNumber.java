package array;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int array[] = new int[]{34, 67, 90, 16, 45, 88};
        int cnt, size;
        size = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] < array[j]) {
                    cnt = array[i];
                    array[i] = array[j];
                    array[j] = cnt;
                }
            }
        }
        System.out.println("Second Smallest Number =" + array[size - 2]);

    }
}
