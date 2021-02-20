package _11InnerClasses._13TestBed;

/**
 * @author Aaron
 * @date 2021-02-20 15:36
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            new TestBed().f();
        }
    }
}
