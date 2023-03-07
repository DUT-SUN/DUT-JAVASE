package demo1;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/07  23:14
 */
abstract class Animal{
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
}
interface Irunning{
    void run();
}
interface Iswiming{
    void swim();
}
interface  Iflying{
    void fly();
}
class Dog extends Animal implements Irunning{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃狗粮");
    }

    @Override
    public void run() {
        System.out.println(name+"在用4条腿跑呢");
    }
}
class Duck extends Animal implements Irunning,Iflying,Iswiming{

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃鸭粮");
    }

    @Override
    public void run() {
        System.out.println(name+"正在用它的大脚掌走路");
    }

    @Override
    public void fly() {
        System.out.println(name+"拍打它的翅膀正在飞");
    }

    @Override
    public void swim() {
        System.out.println(name+"正在用两个大脚滑动游泳");
    }
}
class Brid extends Animal implements Irunning,Iflying{

    public Brid(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃鸟粮");
    }

    @Override
    public void run() {
        System.out.println("鸟用两只细脚跳着跑");
    }

    @Override
    public void fly() {
        System.out.println("鸟用它的翅膀在飞");
    }
}
public class Test {
    public static void walk(Irunning irunning){
        irunning.run();
    }
    public static void main(String[] args) {
        walk(new Dog("大狗",11));
        walk(new Brid("小鸟",4));
        walk(new Duck("唐老鸭",9));
    }
public static void func(Animal animal){
    animal.eat();
}

    public static void main1(String[] args) {
        func(new Duck("大狗",11));
        func(new Brid("小鸟",4));
    }
}
