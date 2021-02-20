package _11InnerClasses._08Parcel7b;

/**
 * @author Aaron
 * @date 2021-02-20 11:52
 * 匿名内部类简化前
 */
interface Contents {
    int value();
}

public class Parcel7b {
    class MyContents implements Contents {
        private int i = 1;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents contents = p.contents();
    }
}
