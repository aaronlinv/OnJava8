package _13FunctionalProgramming._08MultiUnbound;

/**
 * @author Aaron
 * @date 2021-02-23 11:55
 */
class This {
    void two(int i, double d) {
    }

    void three(int i, double d, String s) {
    }

    void four(int i, double d, String s, char c) {
    }
}

interface TwoArgs {
    void call2(This athis, int i, double d);
}

interface ThreeArgs {
    void call3(This athis, int i, double d, String s);
}

interface FourArgs {
    void call4(This athis, int i, double d, String s, char c);
}


public class MultiUnbound {
    public static void main(String[] args) {
        // 接口接方法引用
        TwoArgs twoArgs = This::two;
        ThreeArgs threeArgs = This::three;
        FourArgs fourArgs = This::four;
        This aThis = new This();
        twoArgs.call2(aThis, 1, 1.0);
        threeArgs.call3(aThis, 1, 1.0, "1");
        fourArgs.call4(aThis, 1, 1.0, "1", '1');
    }
}
