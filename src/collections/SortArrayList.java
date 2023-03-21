package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Lion");
        list1.add("Tiger");
        list1.add("Rabbit");
        list1.add("Mouse");

        Collections.sort(list1);
        for (String animal : list1) {
            System.out.println(animal);
        }
        System.out.println("Sorting numbers...");

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(20);
        list2.add(40);
        list2.add(30);
        list2.add(10);
        Collections.sort(list2);

        for (Integer number : list2) {
            System.out.println(number);
        }
    }
}
