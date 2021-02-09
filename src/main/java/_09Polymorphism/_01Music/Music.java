package _09Polymorphism._01Music;

/**
 * @author Aaron
 * @date 2021-02-09 14:50
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);

    }
}
