package _14Streams._10Machine2;

import java.util.Arrays;

/**
 * @author Aaron
 * @date 2021-02-25 09:35
 */
public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Operations[]{
                () -> Operations.show("A"),
                () -> Operations.show("B"),
                () -> Operations.show("C"),
                () -> Operations.show("D")

        }).forEach(Operations::execute);
    }
}
