package _10Interfaces._06Applicator;

import java.util.Arrays;

/**
 * @author Aaron
 * @date 2021-02-18 14:50
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    // 子类重写父类方法时，返回值若为类类型，则必须与父类返回值类型相同或为其子类
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Applicator {
    public static void apply(Processor p, Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }
    
    public static void main(String[] args) {
        String s= "We are such stuff as dreams are made on";
        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);
        
    }
}
