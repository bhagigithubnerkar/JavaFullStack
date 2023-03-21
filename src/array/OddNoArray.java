package array;

public class OddNoArray {
    public static void main(String[] args) {

        int a[] = new int[]{12, 67, 89, 40, 35};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                System.out.println("Odd Numbers in Array = " + a[i]);
            }
        }
    }
}
