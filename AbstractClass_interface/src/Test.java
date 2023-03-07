//抽象方法不可以private，static,final不然不能重写
abstract class Shape{
    public int a;
    public static int b;
    public abstract void draw();

}
class Rect extends Shape{//继承抽象类的时候必须重写抽象方法，快捷键是alt+回车！！！但是假如是抽象类继承抽象类不用重写

    @Override
    public void draw() {
        System.out.println("跳回来了乱玩");
    }
}
public class Test {
    public static void main(String[] args) {
//        Shape shape=new Shape() ;
//抽象类不可以实例化类似于C++的虚继承，C++virtualJAVA是abstract
        Shape shape=new Rect();
        shape.draw();
        System.out.println("服");
    }
}
