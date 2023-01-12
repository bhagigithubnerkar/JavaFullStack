package array;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int array[] = new int[]{10, 20, 40, 20, 60, 10};
        int L = array.length;

        for (int i = 0; i < L - 1; i++) {

            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < L - 1; i++) {
            for (int j = i + 1; j < L; j++) {

                if (array[i] == array[j]) {

                    array[j] = array[L - 1];
                    L--;
                }

            }
        }
        System.out.println("\nThe New Array");

        for (int i = 0; i < L; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
