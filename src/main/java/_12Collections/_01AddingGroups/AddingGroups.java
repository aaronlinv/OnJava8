package _12Collections._01AddingGroups;

import java.util.*;

/**
 * @author Aaron
 * @date 2021-02-22 09:17
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer[] moreInts = {5, 6, 7};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11, 12, 13);
        Collections.addAll(collection, moreInts);
        
        List<Integer> list = Arrays.asList(1,2,3);
        list.set(1, 5);
        // list.add(10); // UnsupportedOperationException

        Object[] objects = collection.toArray();
        Integer[] integers = collection.toArray(new Integer[0]);

        System.out.println(Arrays.toString(objects));

    }

}
