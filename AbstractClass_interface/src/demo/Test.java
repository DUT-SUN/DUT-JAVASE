package demo;

/**
 * 功能描述
 *使用interface来修饰接口
 * 接口中的数据元素默认是public static final
 * 所有的方法都是抽象方法，默认是public abstract
 * 接口中的普通成员方法是不能有具体实现的
 * 如果想要有普通成员方法的实现就必须用default修饰
 * 接口中成员可以有静态方法，都是public修饰的
 * 接口本身不可以进行实例化的
 * 类和接口的关系是通过implement是来关联的
 * @author SUN
 * @date 2023/03/03  21:20
 */
interface IShape{
public int a=10;
public static int b=20;
public static final int c=30;
public default void func()
{
    System.out.println("aaa");
};
public static void func2()
{
    System.out.println("fafa");
}

}
class flower implements IShape{
    @Override
    public  void func()
    {
        System.out.println("画一朵花");
    };
}
class Rect implements IShape {//继承抽象类的时候必须重写抽象方法，快捷键是alt+回车！！！但是假如是抽象类继承抽象类不用重写

    @Override
    public void func() {
        System.out.println("跳回来了乱玩");
    }
}
public class Test {
public static void drawMap( IShape shape){
    shape.func();
}

    public static void main(String[] args) {
        drawMap(new flower());
        drawMap(new Rect());
    }
}
