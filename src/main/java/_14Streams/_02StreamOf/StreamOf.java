package _14Streams._02StreamOf;

import _14Streams.Bubble;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-24 09:08
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream.of(new Bubble(1), new Bubble(2), new Bubble(3))
                .forEach(System.out::println);
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
                .forEach(System.out::println);
        System.out.println();
        Stream.of(3.14159, 2.718, 1.618)
                .forEach(System.out::println);

        System.out.println("------------");
        List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(bubbles
                .stream()
                .mapToInt(b -> b.i)
                .sum()
        );
        HashSet<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::println);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        // entrySet
        m.entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue())
                .forEach(System.out::println);
    }
}
