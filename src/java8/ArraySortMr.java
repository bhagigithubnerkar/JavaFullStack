package java8;

import java.util.Arrays;

public class ArraySortMr {
    public static void main(String[] args) {
        String[] names = {"Tom", "Jerry", "Nobita", "Doraemon", "Shinchan"};
        Arrays.sort(names, String::compareToIgnoreCase);
        for (String n : names) {
            System.out.println(n);
        }
    }
}
