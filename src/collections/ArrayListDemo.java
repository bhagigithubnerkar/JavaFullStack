package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");


        list.add(3, "React JS");
        System.out.println(list);
        list.remove("Python");
        list.remove(3);
        System.out.println("Size " + list.size());
        System.out.println("Empty " + list.isEmpty());
        System.out.println("contains " + list.contains("Java"));


        // Enhanced for loop
        for (String s : list) {
            System.out.println(s);
        }

        // java 8
        list.forEach(c -> System.out.println(c));

        //iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
