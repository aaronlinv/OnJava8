package _10Interfaces._11AdaptedRandomDoubles;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 一个类没有实现 Readable 接口，让 Scanner 作用于它
 */
interface RandomDoubles {
    public Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles() {
        };

        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}

public class AdaptedRandomDoubles implements RandomDoubles, Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }


    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + " ");
        }
    }
}
