package _12Collections._03CrossCollectionIteration;

import java.util.*;

/**
 * @author Aaron
 * @date 2021-02-22 10:33
 */
public class CrossCollectionIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 1, 2, 3, 4, 4));
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        HashSet<Integer> hashSet = new HashSet<>(list);
        TreeSet<Integer> treeSet = new TreeSet<>(list);

        display(list.iterator());
        display(linkedList.iterator());
        display(hashSet.iterator());
        display(treeSet.iterator());

        System.out.println("简化版本");

        display(list);
        display(linkedList);
        display(hashSet);
        display(treeSet);
    }

    public static <E> void display(Iterator<E> it) {
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    // 简化版本
    public static <E> void display(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        
    }

}
