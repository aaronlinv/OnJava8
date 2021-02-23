package _13FunctionalProgramming._18FunctionComposition;

import java.util.function.Function;

/**
 * @author Aaron
 * @date 2021-02-23 16:47
 */
public class FunctionComposition {
    static Function<String, String>
            f1 = s -> {
        System.out.println(s);
        return s.replace('A', '_');
    },
            f2 = s -> s.substring(3),
            f3 = s -> s.toLowerCase(),
            f4 = f1.compose(f2).andThen(f3);

    public static void main(String[] args) {
        System.out.println(f4.apply("GO AFTER ALL AMBULANCES"));// _fter _ll _mbul_nces
        // 先执行 f2 获取子串，再执行f1 和 f3
    }

}
