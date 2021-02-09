package _09Polymorphism._01Music;

/**
 * @author Aaron
 * @date 2021-02-09 14:53
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    
}