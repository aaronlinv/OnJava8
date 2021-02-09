package _09Polymorphism._07RTTI;

/**
 * @author Aaron
 * @date 2021-02-09 16:37
 */
public class Useful {
    public void f() {}
    public void g() {}
}
class MoreUseful extends Useful{
    @Override
    public void f() {}
    @Override
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}
