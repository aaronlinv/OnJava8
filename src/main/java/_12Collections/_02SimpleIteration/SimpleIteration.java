package _12Collections._02SimpleIteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Aaron
 * @date 2021-02-22 10:28
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove(); // 调用 remove() 之前必须先调用 next()
        }
        System.out.println(list);
    }
}
