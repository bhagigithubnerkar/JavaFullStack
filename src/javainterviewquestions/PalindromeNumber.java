package javainterviewquestions;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 1001, reversednum = 0, remainder;

        int Originalnum = num;
        while (num != 0) {
            remainder = num % 10;
            reversednum = reversednum * 10 + remainder;
            num /= 10;
        }
        if (Originalnum == reversednum) {
            System.out.println(Originalnum + " is a palindrome number");
        } else {
            System.out.println(Originalnum + " is not a palindrome number");


        }
    }
}
