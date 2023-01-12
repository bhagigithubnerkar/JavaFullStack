package array;

public class OddNoArray {
    public static void main(String[] args) {
        int a[] = new int[]{12, 34, 67, 80, 29, 15};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {

                System.out.println("Odd Numbers in given array = " + (a[i]));
            }

        }
    }
}
