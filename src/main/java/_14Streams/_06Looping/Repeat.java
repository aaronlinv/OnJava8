package _14Streams._06Looping;

import static java.util.stream.IntStream.range;

/**
 * @author Aaron
 * @date 2021-02-24 10:30
 */
public class Repeat {
    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i -> action.run());
    }
}
