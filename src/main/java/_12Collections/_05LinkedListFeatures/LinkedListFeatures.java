package _12Collections._05LinkedListFeatures;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Aaron
 * @date 2021-02-22 11:45
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(list.getFirst());
        System.out.println(list.element());
        System.out.println(list.peek());

        System.out.println(list);
        // System.out.println(list.remove()); 
        System.out.println(list.removeFirst());
        System.out.println(list);

        list.addFirst(1);
        System.out.println(list);

        // list.offer(10);
        // list.add(10);
        list.addLast(10);
        System.out.println(list);

        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
