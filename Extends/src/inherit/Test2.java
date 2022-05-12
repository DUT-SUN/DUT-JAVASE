package inherit;
class Base{
    public int a=1;
    public  int b=2;
    public void method(){
        System.out.println("Base::method");
    }
}
class Derived extends Base{
    public int a=2;
    public int c=3;
    public int d=4;
    public  void test(){
        //super是子类继承父类的那部分的地址
        System.out.println("访问父类的a"+super.a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        method();
        super.method();
    }
    public void method(){//方法的重写   和父类的一样的函数
        System.out.println("Derived::method");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Derived x=new Derived();
        x.test();
    }
}
