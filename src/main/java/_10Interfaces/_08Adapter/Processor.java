package _10Interfaces._08Adapter;

public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}

