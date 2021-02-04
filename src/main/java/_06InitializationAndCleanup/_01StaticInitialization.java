package _06InitializationAndCleanup;

/**
 * @author Aaron
 * @date 2021-02-04 16:02
 */
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    // 静态成员
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    // 静态成员
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    // 实例成员
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    // 静态成员
    static Bowl bowl5 = new Bowl(5);
}


public class _01StaticInitialization {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    
/*
// static Table对象
Bowl 1
Bowl 2
Table()
f1 1
 
// static Cupboard对象
Bowl 4 
Bowl 5
Bowl 3 // Cupboard类 实例成员变量
Cupboard()
f1 2

main creating new Cupboard()
Bowl 3
Cupboard 
f1 2 // 

main creating new Cupboard()
Bowl 3
Cupboard

f1 2 // 
f2 1
f3 1

 */
}