package array;

public class ThirdSmallestNumber {
    public static void main(String[] args) {
        int array[] = new int[]{230, 140, 187, 560, 348};
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
        System.out.println("Third Smallest Number = " + array[size - 3]);
    }
}


