package _09Polymorphism._04FieldAccess;

/**
 * @author Aaron
 * @date 2021-02-09 15:32
 */
public class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

    public static void main(String[] args) {
        Super sup = new Sub(); // Upcast
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField()); // 0 1 

        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field +
                ", sub.getField() = " + sub.getField()
                + ", sub.getSuperField() = " + sub.getSuperField()); // 1 1 0  
    }
}