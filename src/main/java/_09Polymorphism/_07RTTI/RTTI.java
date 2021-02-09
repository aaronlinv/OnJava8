package _09Polymorphism._07RTTI;

/**
 * @author Aaron
 * @date 2021-02-09 16:37
 */
// Downcasting & Runtime type information (RTTI)
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(), new MoreUseful()
        };
        x[0].f();
        x[1].g();
        // x[1].u();
        // 下转型
        ((MoreUseful) x[1]).u();
        // ((MoreUseful) x[0]).u(); // ClassCastException
    }
}
