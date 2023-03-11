import java.util.Arrays;
import java.util.Objects;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/08  19:59
 */
//Object类是父类，java中除了这个类都存在继承关系
class Person{
    public String name="hello";
    public String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    //重写之后是
    // Person{name='hello'}
    //Student@1d81eb93
//个人心得：重写equals相当于C++运算符重载
//    @Override
//    public boolean equals(Object obj) {
//        if(obj==null){
//            return false;
//        }
//        //这个情况是person1和person2其实指向的是一个空间 p2=p1；这样类似
//        if(this==obj){
//            return true;
//        }
//        //这个情况是防止根本不是一个类，不应该比较的情况
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person tmp=(Person)obj;
//
//        return this.id.equals(tmp.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    //这个和上面差不多，这个是自动生成的
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
class Student{

}
public class Test {
    public static void func(Object o) {
       String str= o.toString();
        System.out.println(str);
        //Person@7ef20235
        //Student@4f3f5b24
    }

    public static void main(String[] args) {
                Person p1=new Person("123");
        Person p2=new Person("123");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //48721
        //48721假如不重写hashcode方法，打印的时候打印出的哈希值是不同的，哈希值用于hashmap后续的快速查找
    }
//    public static void main4(String[] args) {
//        Person p1=new Person("123");
//        Student p2=new Student();
//        System.out.println(p1.equals(p2));
//    }
//    public static void main3(String[] args) {
//        Person p1=new Person("123");
//        Person p2=new Person("123");
//        System.out.println(p1==p2);//false
//        System.out.println(p1.equals(p2));//false,没重写equals方法的时候默认就是调用Object类的方法但是它那个方法就和上面那行一样
////重写完之后就会输出true
//    }
//    public static void main2(String[] args) {
//        func(new Person());
//        func(new Student());
//
//    }
//    public static void main1(String[] args) {
//     Object o=new Person();
//     Object o2=new Student();
//    }

}

