package _14Streams._21OptionalsFromEmptyStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-25 15:58
 */
public class OptionalsFromEmptyStreams {
    public static void main(String[] args) {
        System.out.println(Stream.<String>empty().findFirst()); // Optional.empty
        System.out.println(Stream.<String>empty().findAny()); // Optional.empty

        System.out.println(Stream.<String>empty().max(String.CASE_INSENSITIVE_ORDER)); // Optional.empty
        System.out.println(Stream.<String>empty().min(String.CASE_INSENSITIVE_ORDER)); // Optional.empty

        System.out.println(Stream.<String>empty().reduce((s1, s2) -> s1 + s2)); // Optional.empty
        System.out.println(IntStream.empty().average()); // Optional.empty
        
    }
}
