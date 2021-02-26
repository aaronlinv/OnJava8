package _14Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Aaron
 * @date 2021-02-26 10:42
 * 获取 100个数值范围在 0 到 1000 之间的随机数 的流
 */
public class RandInts {
    private static int[] rints = new Random(47)
            .ints(0, 100)
            .limit(100)
            .toArray();

    public static IntStream rands() {
        return Arrays.stream(rints);
    }
}
