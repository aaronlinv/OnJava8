package _10Interfaces._05Operations;

/**
 * @author Aaron
 * @date 2021-02-18 14:15
 * 静态方法
 */
public interface Operations {
    void execute();

    static void runOps(Operations... ops) {
        for (Operations op : ops) {
            op.execute();
        }
    }
    
    static void show(String msg){
        System.out.println(msg);
    }
}
