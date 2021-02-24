package _14Streams._08Fibonacci;

import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-24 11:23
 */
public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20)
                .limit(10)
                .forEach(System.out::println);
    }
}
