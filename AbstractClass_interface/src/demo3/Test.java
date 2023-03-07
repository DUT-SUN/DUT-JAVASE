package demo3;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/08  0:05
 */
class Money implements Cloneable{
    public  int money=10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age=10;
     Money m=new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp=(Person) super.clone();
        tmp.m=(Money) this.m.clone();//这样修改之后让money克隆一份然后克隆引用指向克隆钱，就不会出现一个修改另一个也一起修改的情况
        return tmp;

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
//alt+enter给这个person.clone添加不报错，然后强转object为person然后被接受，这样才能成功拷贝一份副本

//为什么object的clone方法要被子类student重写（明明已经继承了呀？？？？

//原因：object的clone方法是protected修饰的说明是不同包的方法，所以被子类继承的时候必须调用父类的方法
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person();
        Person person1=(Person) person.clone();
        System.out.println(person.age);
        System.out.println(person.m.money);
        System.out.println(person1.age);
        System.out.println(person1.m.money);
        person.m.money=99;
        //这样拷贝的时候，他们的钱类指向的是同一个值，引用确实是指向两个student
        System.out.println(person.age);
        System.out.println(person.m.money);
        System.out.println(person1.age);
        System.out.println(person1.m.money);
    }
}
