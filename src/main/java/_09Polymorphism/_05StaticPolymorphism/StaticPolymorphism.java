package _09Polymorphism._05StaticPolymorphism;

/**
 * @author Aaron
 * @date 2021-02-09 15:45
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup= new StaticSub();
        System.out.println(StaticSuper.staticGet()); // Base staticGet()
        System.out.println(sup.dynamicGet()); // Derived dynamicGet()
        
    }
}
