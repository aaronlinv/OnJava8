package _14Streams._13SortedComparator;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-25 11:30
 */
public class FileToWords {
    public static Stream<String> stream(String filePath)
            throws Exception {
        return Files.lines(Paths.get(filePath))
                .skip(1)
                .flatMap(line ->
                        Pattern.compile("\\W+").splitAsStream(line));
    }
}
