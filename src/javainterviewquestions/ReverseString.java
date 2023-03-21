package javainterviewquestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Bhagyashri Chetan Nerkar";
        int size = str.length();

        System.out.println("Reverse of the string:" + "" + str + "");

        for (int i = 0; i < size; i++) {

            // printing in reverse order

            System.out.println(str.charAt(str.length() - i - 1));
        }
    }
}
