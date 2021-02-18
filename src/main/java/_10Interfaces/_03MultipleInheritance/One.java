package _10Interfaces._03MultipleInheritance;

/**
 * @author Aaron
 * @date 2021-02-18 14:02
 */
public interface One {
    default void first(){
        System.out.println("first");
    }
    
}


interface Two{
    default void second(){
        System.out.println("second");
    }
    
}

interface Three{
    default void third(){
        System.out.println("third");
    }
}


class MI implements One,Two,Three{}