package _13FunctionalProgramming._13TriFunctionTest;

/**
 * @author Aaron
 * @date 2021-02-23 15:29
 */
@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

public class TriFunctionTest {
    static int f(int i, long l, double d) {
        return 99;
    }

    public static void main(String[] args) {
        TriFunction<Integer,Long,Double,Integer> tf = TriFunctionTest::f;
        tf = (i,l,d) ->12;
        
        
    }
}
