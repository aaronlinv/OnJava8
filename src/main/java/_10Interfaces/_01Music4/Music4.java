package _10Interfaces._01Music4;

import _09Polymorphism._01Music.Note;

/**
 * @author Aaron
 * @date 2021-02-18 11:31
 */
public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion()
        };

        tuneAll(orchestra);
    }
}
