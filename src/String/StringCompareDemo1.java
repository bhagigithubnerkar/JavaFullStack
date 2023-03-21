package String;

public class StringCompareDemo1 {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        String s3 = new String("Pune");
        String s4 = "Mumbai";
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s1.equals(s4));  //false
        String s5 = "Pune";
        String s6 = "Amritsar";
        System.out.println("s1.equals(s2): " + s1.equals(s2));  //true
        System.out.println("s1.equals(s3): " + s1.equals(s3));  // true
        System.out.println("s1.equals(s4): " + s1.equals(s4));  // false
        System.out.println("s1.equalsIgnoreCase(s5): " + s1.equals(s5));

        System.out.println(s1 == s2);   //true
        System.out.println(s1 == s3);  // false

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));
        System.out.println("s6.compareTo(s4): " + s6.compareTo(s4));


    }
}
