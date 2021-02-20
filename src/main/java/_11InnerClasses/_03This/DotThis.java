package _11InnerClasses._03This;

/**
 * @author Aaron
 * @date 2021-02-20 09:34
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            // 外部类
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        // new外部类，外部类里面的方法new 内部类
        // 内部类里面的方法通过 .this 获取外部类引用 就可以调用内部类方法
        DotThis dt = new DotThis();
        Inner dti = dt.inner();
        dti.outer().f();
    }

}
