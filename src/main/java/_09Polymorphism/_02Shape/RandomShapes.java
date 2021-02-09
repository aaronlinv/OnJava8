package _09Polymorphism._02Shape;

import java.util.Random;

/**
 * @author Aaron
 * @date 2021-02-09 15:09
 */
public class RandomShapes {
    private Random random = new Random(47);


    public Shape get() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public Shape[] array(int sz) {
        Shape[] shapes = new Shape[sz];
        for (int i = 0; i < sz; i++) {
            shapes[i] = get();
        }
        return shapes;
    }
}
