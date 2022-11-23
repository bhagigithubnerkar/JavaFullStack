package array;

public class OddPositionElement {

    public static void main(String[] args) {
        int array[] = new int[]{5, 8, 10, 53, 34, 60, 23};

        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);

        }
    }
}
