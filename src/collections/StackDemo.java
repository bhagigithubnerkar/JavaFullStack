package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(20));
        System.out.println(stack.empty());
        stack.forEach(c -> {
            System.out.println(c);
        });
        System.out.println(stack.capacity());
        System.out.println(stack.elementAt(3));
        System.out.println(stack.contains(50));
        System.out.println(stack.remove(2));
        System.out.println(stack.indexOf(40));

    }
}
