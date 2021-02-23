package _13FunctionalProgramming._15SharedStorage;

import java.util.function.IntSupplier;

/**
 * @author Aaron
 * @date 2021-02-23 15:56
 */
class Closure1 {
    // 如果你对同一个对象多次调用 makeFun() ，你最终会得到多个函数，它们共享 i 的存储空间
    // int i;
    //
    // IntSupplier makeFun(int x) {
    //     return () -> x + i++;
    // }


    // 局部变量
    // IntSupplier makeFun(int x) {
    //     final int i = 0;
    //     // x 和 i ：被 Lambda 表达式引用的局部变量必须是 final 或者是等同 final 效果的
    //     return () -> x + i;
    // }

    // 在闭包中，在使用 x 和 i 之前，通过将它们赋值给 final 修饰的变量
    IntSupplier makeFun(int x) {
        int i = 0;
        i++;
        x++;

        final int iFinal = i;
        final int xFinal = x;

        return () -> xFinal + iFinal;
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
