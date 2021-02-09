package _09Polymorphism._03PrivateOverride;

/**
 * @author Aaron
 * @date 2021-02-09 15:21
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

}

class Derived extends PrivateOverride {
    // @Override
    public void f() {
        System.out.println("public f()");
    }
}
