package _09Polymorphism._02Shape;

/**
 * @author Aaron
 * @date 2021-02-09 15:09
 */
public class Main {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        for (Shape shape : gen.array(9)) {
            shape.draw();
        }
    }
}
