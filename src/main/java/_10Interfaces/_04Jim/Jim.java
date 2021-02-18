package _10Interfaces._04Jim;

/**
 * @author Aaron
 * @date 2021-02-18 14:07
 * 
 * 接口默认方法签名相同
 */
interface Jim1{
    default void jim(){
        System.out.println("Jim1::jim");
    }
}
interface Jim2{
    default void jim(){
        System.out.println("Jim2::jim");
    }
}
public class Jim implements Jim1,Jim2 {
    @Override
    public void jim(){
        // 使用 super 关键字选择基类实现
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
