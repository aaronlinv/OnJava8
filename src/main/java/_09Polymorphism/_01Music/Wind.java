package _09Polymorphism._01Music;

/**
 * @author Aaron
 * @date 2021-02-09 14:49
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
