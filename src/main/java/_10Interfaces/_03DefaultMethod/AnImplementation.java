package _10Interfaces._03DefaultMethod;

/**
 * @author Aaron
 * @date 2021-02-18 12:41
 */
public class AnImplementation implements AnInterface{
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface  i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}
