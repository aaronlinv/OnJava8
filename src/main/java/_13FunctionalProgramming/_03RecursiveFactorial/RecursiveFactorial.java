package _13FunctionalProgramming._03RecursiveFactorial;

/**
 * @author Aaron
 * @date 2021-02-23 10:27
 * 整数 n 的阶乘
 */
interface IntCall {
    int call(int arg);
}

public class RecursiveFactorial {
    static IntCall fact;

    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(fact.call(i));
        }
    }
}
