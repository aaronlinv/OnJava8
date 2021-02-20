package _11InnerClasses._05Parcel4;

/**
 * @author Aaron
 * @date 2021-02-20 10:07
 * 内部类隐藏实现细节
 */

public class Parcel4 {
    // private 外部对象不能直接new
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {
        private String label;

        public PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    // 提供获取内部类的方法 用接口接对象 向上转型
    public Destination destination(String s) {
        return new PDestination(s);
    }

    // 提供获取内部类的方法 用接口接对象 向上转型
    public Contents contents() {
        return new PContents();
    }

}

class Test {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents contents = p.contents();
        Destination destination = p.destination("test");

        // PContents 构造器私有
        // Parcel4.PContents pContents = p.new PContents();

    }
}