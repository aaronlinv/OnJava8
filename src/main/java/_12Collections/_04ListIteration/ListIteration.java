package _12Collections._04ListIteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Aaron
 * @date 2021-02-22 10:58
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 1, 2, 3, 4, 4));
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next()+" nextIndex："+it.nextIndex()+" previousIndex："+it.previousIndex());
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
        
        it = list.listIterator(3);
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
            it.set(10);
            it.add(11);
        }
        System.out.println(list);
    }
}
