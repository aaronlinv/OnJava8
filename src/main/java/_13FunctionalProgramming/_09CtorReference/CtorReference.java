package _13FunctionalProgramming._09CtorReference;

/**
 * @author Aaron
 * @date 2021-02-23 14:03
 * 构造函数引用
 */
class Dog {
    String name;
    int age = 1;

    public Dog() {
        name = "stray";
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Args {
    Dog make(String nm);
}

interface Make2Args {
    Dog make(String nm, int age);
}

public class CtorReference {

    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new;
        Make1Args m1a = Dog::new;
        Make2Args m2a = Dog::new;
        Dog make = mna.make();
        Dog comet = m1a.make("Comet");
        m2a.make("Ralph", 14);
    }
}
