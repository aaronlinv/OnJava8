package _10Interfaces._05Operations;

/**
 * @author Aaron
 * @date 2021-02-18 14:18
 * 模板方法设计模式
 */
class Bing implements Operations {

    @Override
    public void execute() {
        System.out.println("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        System.out.println("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        System.out.println("Twist");
    }
}


public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist()
        );
    }
}
