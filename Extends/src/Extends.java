/*class OutClass{
    public int data1=1;
    private int data2=2;
    public static int data3=3;
class InnerClass{//1.实例内部类，静态变量必须加final
    public int data4=4;
    private int data5=5;
    public static final int data6=6;
public void test{
        System.out.println(this.data4);
        System.out.println(OutClass.this.data1);
    }
}
}*/

/*class OutClass{
    public int data1=1;
    private int data2=2;
    public static int data3=3;
  static class InnerClass{//2.静态内部类 不能在静态内部类直接访问非静态成员，如果想访问方法创建一个外部类对象即可，或者在构造的时候传过来外部类对象的引用
        public int data4=4;
        private int data5=5;
        public static  int data6=6;
        public void test(){
            System.out.println(this.data4);
//            System.out.println(OutClass.this.data1);没有外部类指针
        }
    }
}*/

public class Extends {
/*    public static void func(){
        class A{//3.局部内部类 字节码文件的$后面有个1来区分
            public void test(){
                System.out.println("局部内部类");
            }
        }
        A a=new A();
    }*/
String name="涛哥";
    public void test(){
        System.out.println("sun");
    }

    @Override
    public String toString() {//对象的打印
        return name;
    }
    public static void main(String[] args) {
/*OutClass x=new OutClass();
OutClass.InnerClass y=x.new InnerClass();*/

/*   OutClass.InnerClass x=new OutClass.InnerClass();*/

/*        new person(){//匿名对象
            @Override
            public void test() {
                System.out.println("niuma");
            }
        }.test();*/
     Extends x=new Extends();
        System.out.println(x);
    }

}
