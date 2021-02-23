package _13FunctionalProgramming._01Strategize;

/**
 * @author Aaron
 * @date 2021-02-22 17:44
 */

interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    // 必须 static 
    public static String twice(String msg) {
        return msg + " " + msg;
    }
}


public class Strategize {
    Strategy strategy;
    String msg;

    public Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {  // 1. 匿名内部类
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg -> msg.substring(0, 5), // Java 8 的 Lambda 表达式，与单独定义类和采用匿名内部类是等价的
                Unrelated::twice// Java 8 的方法引用
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.communicate();
        }
    }

}
