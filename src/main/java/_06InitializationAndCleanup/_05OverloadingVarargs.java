package _06InitializationAndCleanup;

/**
 * @author Aaron
 * @date 2021-02-04 17:08
 */
public class _05OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("first");
        for (Character c : args) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("second");
        for (Integer i : args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("third");
    }

    // static void f(Long args) {
    //     System.out.println("third");
    // }
    
    //
    // static void f(Long arg, Long... args) {
    //     System.out.println("third");
    // }


    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        //- f(); // Won's compile -- ambiguous
    }
}
