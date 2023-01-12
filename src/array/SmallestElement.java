package array;

public class SmallestElement {
    public static void main(String[] args) {
        int array[] = new int[]{780, 500, 650, 126, 420, 600};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Smallest Element in given array: " + min);
    }
}
