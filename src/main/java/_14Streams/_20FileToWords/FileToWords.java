package _14Streams._20FileToWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-25 15:48
 */
public class FileToWords {
    public static Stream<String> stream(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .skip(1)
                // \\W+ 是一个正则表达式。表示“非单词字符”
                .flatMap(line -> Pattern.compile("\\W+").splitAsStream(line));
    }

    public static void main(String[] args) throws IOException {
        stream("src/main/resources/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();

        stream("src/main/resources/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
