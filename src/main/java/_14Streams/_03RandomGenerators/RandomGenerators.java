package _14Streams._03RandomGenerators;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-24 09:26
 */
public class RandomGenerators {
    public static <T> void show(Stream<T> stream) {
        stream
                .limit(4)
                .forEach(System.out::println);
        System.out.println("++++++++++++");
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        show(rand.ints().boxed());
        show(rand.longs().boxed());
        show(rand.doubles().boxed());

        // 空中上下限
        show(rand.ints(10, 20).boxed());
        show(rand.longs(10, 20).boxed());
        show(rand.doubles(10, 20).boxed());

        // 控制流大小
        show(rand.ints(2).boxed());
        show(rand.longs(2).boxed());
        show(rand.doubles(2).boxed());

        // 控制流大小 下界 上界
        show(rand.ints(3, 3, 9).boxed());
        show(rand.longs(3, 12, 22).boxed());
        show(rand.doubles(3, 11.5, 12.3).boxed());
    }
}
