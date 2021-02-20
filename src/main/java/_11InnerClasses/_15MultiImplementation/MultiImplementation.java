package _11InnerClasses._15MultiImplementation;

/**
 * @author Aaron
 * @date 2021-02-20 15:51
 */
class D {

}

abstract class E {

}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}

public class MultiImplementation {
    static void takeD(D d) {
    }

    static void takeE(E e) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
}
