package _14Streams._05Ranges;

import static java.util.stream.IntStream.range;

/**
 * @author Aaron
 * @date 2021-02-24 10:21
 */
public class Ranges {
    public static void main(String[] args) {
        // for-in 循环
        int result = 0;
        // 静态引入
        for (int i : range(10, 20).toArray()) {
            result += i;
        }
        System.out.println(result);

        // 使用流
        System.out.println(range(10, 20).sum());
    }
}
