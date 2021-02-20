package _11InnerClasses._04New;

/**
 * @author Aaron
 * @date 2021-02-20 09:45
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner inner = dn.new Inner();
    }
}

class test {
    public static void main(String[] args) {
        
    }
}

