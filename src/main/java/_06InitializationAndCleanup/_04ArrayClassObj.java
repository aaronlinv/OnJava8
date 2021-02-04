package _06InitializationAndCleanup;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Aaron
 * @date 2021-02-04 16:57
 */
public class _04ArrayClassObj {
    public static void main(String[] args) {
        int[] a;

        // seed
        Random random = new Random(47);
        // System.out.println(random.nextInt(20)); // 18

        a = new int[random.nextInt(20)];

        System.out.println(Arrays.toString(a));
    }

}
