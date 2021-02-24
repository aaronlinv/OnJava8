package _14Streams._07Generator;

import _14Streams.Bubble;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-24 10:38
 */
public class Generator implements Supplier<String> {
    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return String.valueOf(letters[rand.nextInt(letters.length)]);
    }

    public static void main(String[] args) {
        // 1. 使用实现Supplier接口的对象
        String word = Stream.generate(new Generator())
                .limit(30)
                .collect(Collectors.joining());

        System.out.println(word);
        // 2. 传递一个生成那些对象的 lambda 到 generate() 中
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
        // 3. bubbler() 与 Supplier<Bubble> 是接口兼容的 ：传递方法引用
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }

}
