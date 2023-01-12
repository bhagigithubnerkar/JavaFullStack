package exceptionhandling;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter not grater than array length");
        }
        System.out.println("Rest of the code");
    }
}
