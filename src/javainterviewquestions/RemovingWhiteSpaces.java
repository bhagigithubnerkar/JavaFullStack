package javainterviewquestions;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        String str = "Welcome To The Java World";
        str = str.replace(" ", "");
        System.out.println(str);
        String str1 = "How Are You?";
        str1 = str1.replace(" ", "");
        System.out.println(str1);
    }
}
