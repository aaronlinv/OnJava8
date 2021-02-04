package _06InitializationAndCleanup;

import java.util.Arrays;

/**
 * @author Aaron
 * @date 2021-02-04 17:21
 */
public class _06EnumDemo {
    public static void main(String[] args) {
        Spiciness not = Spiciness.NOT;
        System.out.println(not);
        System.out.println(not.ordinal()); // 0 
        System.out.println(Arrays.toString(Spiciness.values()));
        
    }
}
