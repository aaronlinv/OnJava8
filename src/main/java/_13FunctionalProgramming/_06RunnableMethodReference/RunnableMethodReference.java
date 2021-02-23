package _13FunctionalProgramming._06RunnableMethodReference;

/**
 * @author Aaron
 * @date 2021-02-23 11:22
 */
class Go {
    static void go() {
        System.out.println("Go::go");
    }
}

public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(() -> System.out.println("lambda")).start();

        new Thread(Go::go).start();
    }
}
