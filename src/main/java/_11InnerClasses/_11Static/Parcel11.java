package _11InnerClasses._11Static;

import _11InnerClasses._05Parcel4.Contents;
import _11InnerClasses._05Parcel4.Destination;

/**
 * @author Aaron
 * @date 2021-02-20 15:15
 */
public class Parcel11 {
    // 嵌套类 (静态)
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static final class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }
    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("test");
    }
}
