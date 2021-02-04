package _06InitializationAndCleanup;

/**
 * @author Aaron
 * @date 2021-02-04 16:38
 */

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}

public class _03Mugs {
    Mug mug1;
    Mug mug2;

    { // [1]
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    _03Mugs() {
        System.out.println("Mugs()");
    }

    _03Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new _03Mugs();
        System.out.println("new Mugs() completed");
        new _03Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
/*
Inside main()
Mug 1
Mug 2
mug1 & mug2 initialized
Mugs()
new Mugs() completed

Mug 1
Mug 2
mug1 & mug2 initialized
Mugs(int)
new Mugs(1) completed
 */
