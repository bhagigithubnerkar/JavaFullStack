package String;

public class StringCompareDemo {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        String s3 = new String("Pune");
        String s4 = "Mumbai";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        String s5 = "Pune";
        String s6 = "Amritsar";
        System.out.println("s1.equals");


        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
