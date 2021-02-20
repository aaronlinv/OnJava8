package _11InnerClasses._06Parcel5;

/**
 * @author Aaron
 * @date 2021-02-20 11:30
 */
interface Destination {
    String readLabel();
}

public class Parcel5 {
    public Destination destination(String s) {
        // 局部内部类
        final class PDestination implements Destination {
            private String label;

            public PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("test");
    }
}
