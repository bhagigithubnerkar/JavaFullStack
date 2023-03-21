package javainterviewquestions;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Nitin", reverseStr = "";
        int strlength = str.length();

        for (int i = (strlength - 1); i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a palindrome String");
        } else {
            System.out.println(str + " is not a palindrome String ");
        }
    }
}
