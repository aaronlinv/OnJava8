package _10Interfaces._03DefaultMethod;

/**
 * @author Aaron
 * @date 2021-02-18 12:39
 */
public interface AnInterface {
    void firstMethod();
    void secondMethod();
    default void newMethod(){
        System.out.println("newMethod");
    }
}