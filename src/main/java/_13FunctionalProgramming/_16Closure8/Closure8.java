package _13FunctionalProgramming._16Closure8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Aaron
 * @date 2021-02-23 16:21
 */
public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        // final 可以去掉
        final List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure8 c7 = new Closure8();
        List<Integer> l1 = c7.makeFun().get(),
                l2 = c7.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);

        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}
