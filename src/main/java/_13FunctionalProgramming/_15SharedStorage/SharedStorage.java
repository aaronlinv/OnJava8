package _13FunctionalProgramming._15SharedStorage;

import java.util.function.IntSupplier;

/**
 * @author Aaron
 * @date 2021-02-23 15:56
 */
class Closure1 {
    // 如果你对同一个对象多次调用 makeFun() ，你最终会得到多个函数，它们共享 i 的存储空间
    int i;

    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}

public class SharedStorage {
    public static void main(String[] args) {
        Closure1 c1 = new Closure1();
        IntSupplier f1 = c1.makeFun(0);
        IntSupplier f2 = c1.makeFun(0);
        IntSupplier f3 = c1.makeFun(0);
        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());
    }
}
