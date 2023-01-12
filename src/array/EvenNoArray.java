package array;

public class EvenNoArray {
    public static void main(String[] args) {
        int a[] = new int[]{23, 56, 40, 39, 12, 64};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Even Numbers in given array =" + (a[i]));
            }
        }
    }
}
