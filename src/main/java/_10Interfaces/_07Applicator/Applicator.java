package _10Interfaces._07Applicator;

import _10Interfaces._08Adapter.Processor;

import java.util.Arrays;


public class Applicator {
    public static void apply(Processor p, Object o) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }
}

interface StringProcessor extends Processor {
    @Override
    String process(Object input);

    String S = "If she weighs the same as a duck, she's made of wood";

    static void main(String[] args) {
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}

class Upcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}