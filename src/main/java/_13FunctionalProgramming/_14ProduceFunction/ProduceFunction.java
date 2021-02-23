package _13FunctionalProgramming._14ProduceFunction;

import java.util.function.Function;

/**
 * @author Aaron
 * @date 2021-02-23 15:42
 */
// 使用继承为专用接口起别名
interface FuncSS extends Function<String, String> {
}

public class ProduceFunction {
    static FuncSS produce() {
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        // 这里 produce() 是高阶函数
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }
}
