package _14Streams._13SortedComparator;

import java.util.Comparator;

/**
 * @author Aaron
 * @date 2021-02-25 11:28
 */
public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("src/main/resources/Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
