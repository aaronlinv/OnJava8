package _11InnerClasses._09Parcel8;

/**
 * @author Aaron
 * @date 2021-02-20 11:56
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);

        System.out.println(w.value());

    }
}

class Wrapping {
    private int i;

    public Wrapping(int i) {
        this.i = i;
    }

    public int value() {
        return i;
    }
}
