package _13FunctionalProgramming._07UnboundMethodReference;

/**
 * @author Aaron
 * @date 2021-02-23 11:31
 */
class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        // MakeString ms = X::f; // invalid method reference
        TransformX sp = X::f;

        X x = new X();
        // 效果相同
        System.out.println(sp.transform(x)); // 
        System.out.println(x.f());// 对象调用方法
    }
}
