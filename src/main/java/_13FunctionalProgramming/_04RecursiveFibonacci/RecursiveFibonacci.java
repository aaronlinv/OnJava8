package _13FunctionalProgramming._04RecursiveFibonacci;

/**
 * @author Aaron
 * @date 2021-02-23 10:33
 * 斐波那契
 */
interface IntCall {
    int call(int arg);
}

public class RecursiveFibonacci {
    IntCall fib;

    public RecursiveFibonacci() {
        // fib = n -> {
        //     if (n == 0) return 0;
        //     if (n == 1) return 1;
        //     return fib.call(n - 1) + fib.call(n - 2);
        // };
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) {
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for (int i = 0; i <= 10; i++) {
            System.out.println(rf.fibonacci(i));
        }
    }
}
