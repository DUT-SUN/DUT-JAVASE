package demo2;
import demo1.DuoTai;
public class Test extends DuoTai {
    public void func2() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
    /*  DuoTai c=new DuoTai();
        System.out.println(c.a);//不同包的子类访问是可以访问的，但是不能通过引用访问，只能在函数中访问*/
        Test test = new Test();
        test.func2();
    }
}