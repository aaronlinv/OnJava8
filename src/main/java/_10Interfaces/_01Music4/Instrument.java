package _10Interfaces._01Music4;

import _09Polymorphism._01Music.Note;

/**
 * @author Aaron
 * @date 2021-02-18 11:31
 */
abstract class Instrument {
    private int i;

    public abstract void play(Note e);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    
    @Override
    public String what(){
        return "Percussion";
    }
    @Override
    public void adjust(){
        System.out.println("Adjusting Percussion");
    }
    
}