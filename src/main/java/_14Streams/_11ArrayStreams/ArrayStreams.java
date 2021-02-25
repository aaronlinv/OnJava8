package _14Streams._11ArrayStreams;

import java.util.Arrays;

/**
 * @author Aaron
 * @date 2021-02-25 09:51
 */
public class ArrayStreams {
    public static void main(String[] args) {
        Arrays.stream(new double[]{3.14159, 2.718, 1.618})
                .map(n -> n * 2)
                .forEach(n -> System.out.format("%f", n));
        ;
    }
}
