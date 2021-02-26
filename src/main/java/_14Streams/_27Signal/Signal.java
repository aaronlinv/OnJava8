package _14Streams._27Signal;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author Aaron
 * @date 2021-02-26 10:16
 */
public class Signal {
    private final String msg;

    public Signal(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    static Random rand = new Random(47);

    public static Signal morse() {
        switch (rand.nextInt(4)) {
            case 1:
                return new Signal("dot");
            case 2:
                return new Signal("dash");
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Signal(" + msg + ')';
    }

    public static Stream<Optional<Signal>> stream() {
        return Stream.generate(Signal::morse)
                .map(signal -> Optional.ofNullable(signal));
    }

    public static void main(String[] args) {
        Signal.stream()
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------");
        Signal.stream()
                .limit(10)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
    
}
