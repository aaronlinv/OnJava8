package _14Streams._28TreeSetOfWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author Aaron
 * @date 2021-02-26 14:07
 */
public class TreeSetOfWords {
    public static void main(String[] args) throws IOException {
        Set<String> word2 =
                Files.lines(Paths.get("src/main/resources/Cheese.dat"))
                        .flatMap(s -> Arrays.stream(s.split("\\W+")))
                        .map(String::trim)
                        .filter(s -> s.length() > 2)
                        .limit(100)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(word2);
    }
}
