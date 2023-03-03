package 多态;
//向上转型的意思是子类可以赋值给父类
class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }
public void eat(){
    System.out.println(getName()+"在吃饭");
}
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark(){
        System.out.println(getName()+"汪汪汪！");
    }
    @Override
    public void eat(){
        System.out.println(getName()+"在吃狗粮");
    }
}
class Brid extends  Animal{

    public Brid(String name, int age) {
        super(name, age);
    }
    public void fly(){
        System.out.println(getName()+"正在飞");
    }
    @Override
    public  void eat(){
        System.out.println(getName()+"在吃鸟粮");
    }//方法的重写
}
//重写需要满足的条件
/*1.方法名相同
2.参数列表相同
3.返回值相同，不一定要一模一样，也可以是协变类型————就是子类的返回值和父类的返回值是父子类关系
4.satic和private修饰不可以被重写
5.子类的访问修饰符要大于等于父类的访问修饰符*/
public class Test {
    public static void function(Animal animal){
        animal.eat();
    }
    public static void main4(String[] args) {
//        Brid brid=new Brid("鹦鹉",2);
/*brid.fly();
brid.eat();*/
//Animal animal=brid;
//animal.eat();
        function(new Brid("鸟鸟",23));
        function(new Dog("哈士奇",11));

    }
//这个是可以运行的！！！！！！！！！！！
    public static void main5(String[] args) {
      Animal animal=new Brid("鹦鹉",2);
//      animal.fly();
        //animal是没有飞这个属性的，所以肯定是不可以用的
        Brid brid=(Brid) animal;//强制向下转型
        brid.fly();
    }
//这个是不可以运行的！！！！！！！！
    //报错如下：
/*Exception in thread "main" java.lang.ClassCastException: class 多态.Dog cannot be cast to class 多态.Brid (多态.Dog and 多态.Brid are in unnamed module of loader 'app')
    at 多态.Test.main(Test.java:99)*/
    //因为狗不是鸟
    public static void main(String[] args) {

        Animal animal=new Dog("涛哥",19);
//      animal.fly();
        //animal是没有飞这个属性的，所以肯定是不可以用的
        if(animal instanceof Brid) {//加上这个语句就可以不报错了，因为animal是鸟才运行
            Brid brid = (Brid) animal;//强制向下转型
            brid.fly();
        }
    }
}
//向上转型3种情况
/*
1.直接赋值
2.方法传参
3.返回值返回*/
