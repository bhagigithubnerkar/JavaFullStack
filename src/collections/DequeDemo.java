package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>();
        fruits.addFirst("Apple");
        fruits.addLast("JackFruit");
        fruits.offerLast("Pomegranate");
        fruits.addFirst("Mango");
        fruits.addFirst("Banana");
        for (String s : fruits) {
            System.out.println(s);
        }
        fruits.removeFirst();
        fruits.pollFirst();
        for (String s : fruits) {
            System.out.println();
        }
       /* fruits.removeLast();
        fruits.pollLast();
        fruits.getFirst();
        fruits.getLast();




        for (String s : fruits){
            System.out.println(s);
        }*/

    }
}
