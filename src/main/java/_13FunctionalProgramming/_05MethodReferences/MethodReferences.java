package _13FunctionalProgramming._05MethodReferences;

/**
 * @author Aaron
 * @date 2021-02-23 10:44
 */
interface Callable {
    void call(String s);
}

class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferences {
    static void hello(String name) {
        System.out.println("hello," + name);
    }

    static class Description {
        String about;

        public Description(String about) {
            this.about = about;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Describe d = new Describe();
        // 1. 方法引用
        // 因为方法引用符合 Callable 的 call() 方法的签名
        Callable c = d::show;
        // Java 将 call() 映射到 show()
        c.call("call()");

        // 2. 静态方法引用
        c = MethodReferences::hello;
        c.call("Bob");

        // 3. 内部静态类非静态方法 已实例化对象的方法的引用，有时称为绑定方法引用
        c = new Description("valuable")::help;
        c.call("infomation");

        // 4. 静态内部类中的静态方法
        c = Helper::assist;
        c.call("Help!");
    }
}
