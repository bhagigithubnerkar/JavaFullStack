package array;

public class ArrayDemo {
    public static void main(String[] args) {
        int array[] = new int[5];   //0-4
        System.out.println("Array " + array);
        array[0] = 10;
        array[3] = 40;
        //array[5] = 45;  //ArrayIndexOutOfBoundsException

        int arr[] = {10, 40, 30, 40};
        for (int a : array) {
            System.out.println(a + " ");
        }
        System.out.println("\n Arr length " + arr.length);
        System.out.println("4th position element " + array[3]);
    }
}
