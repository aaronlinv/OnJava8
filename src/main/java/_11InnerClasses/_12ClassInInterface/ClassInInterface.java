package _11InnerClasses._12ClassInInterface;

import java.util.Map;

/**
 * @author Aaron
 * @date 2021-02-20 15:27
 */
public interface ClassInInterface {
    void howdy();

    // 默认就是static 和 public 
    public static class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }

    }

}
