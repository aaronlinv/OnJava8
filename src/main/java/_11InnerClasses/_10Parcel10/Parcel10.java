package _11InnerClasses._10Parcel10;

/**
 * @author Aaron
 * @date 2021-02-20 14:53
 */
interface Destination {
    String readLabel();
}

public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {

        Parcel10 p = new Parcel10();
        Destination d = p.destination("test", 101.39f);

    }
    
}
