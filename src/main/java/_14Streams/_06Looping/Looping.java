package _14Streams._06Looping;

import static _14Streams._06Looping.Repeat.repeat;

/**
 * @author Aaron
 * @date 2021-02-24 10:29
 */

public class Looping {
    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping"));
        repeat(2, Looping::hi);
    }
}
