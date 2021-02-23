package _13FunctionalProgramming._17AnonymousClosure;

import java.util.function.IntSupplier;

/**
 * @author Aaron
 * @date 2021-02-23 16:30
 */
public class AnonymousClosure {
    // 实际上只要有内部类，就会有闭包（Java 8 只是简化了闭包操作）
    // 在 Java 8 之前，变量 x 和 i 必须被明确声明为 final。在 Java 8 中，内部类的规则放宽，包括等同 final 效果
    IntSupplier makeFun(int x) {
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x + i;
            }
        };
    }
}
