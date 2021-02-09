package _09Polymorphism._01Music;

/**
 * @author Aaron
 * @date 2021-02-09 14:55
 */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }


    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();

        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
