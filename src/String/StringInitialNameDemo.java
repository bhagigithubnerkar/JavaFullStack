package String;

import java.util.Locale;

public class StringInitialNameDemo {
    public static void main(String[] args) {
        String str = "bhagyashri chetan nerkar";
        String names[] = str.split(" ");
        String firstName = names[0].substring(0, 1);
        System.out.println(firstName);
        String middleName = names[1].substring(0, 1);
        System.out.println(middleName);
        String lastName = names[2].substring(0, 1).toUpperCase().concat(names[2].substring(1).toLowerCase());
        String fullName = firstName.toUpperCase() + "." + middleName.toUpperCase() + "." + lastName;
        System.out.println(fullName);
        System.out.println(firstName.startsWith("B"));  //false
        System.out.println(lastName.endsWith("r"));     //true
        System.out.println(str.charAt(5));   //a
        System.out.println(str.length());    //21

        int a = 50;
        String n = String.valueOf(a);

        String s1 = "This is Java course, and we are Java Developer!";
        String s2 = s1.replace("Java", "React");
        System.out.println(s2);


    }
}
