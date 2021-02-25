package _14Streams._18FlatMap;

import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-25 15:36
 */
public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);
    }
}
