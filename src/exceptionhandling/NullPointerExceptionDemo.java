package exceptionhandling;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Please enter not null string");
        }
        System.out.println("Rest of the code");
    }
}
