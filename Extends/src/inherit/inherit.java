package inherit;
class Animal{
    public String name;
    public int age;

    public Animal(String name,int age) {
        this.name = name;
        this.age=age;
    }
}
class Dog extends Animal{

    public float weight;

    public Dog(String name, int age, float weight) {
        super(name, age);
        this.weight = weight;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }
   public void bark(){
       System.out.println(name+"正在汪汪");
   }
}
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("吃");
    }
    public void bark(){
        System.out.println("喵");
    }
}
//!!!!先调用父类的静态代码块然后子类静态代码块，然后父类的实例代码块和构造然后子类的静态代码块和构造
public class inherit {
    public static void main(String[] args) {
        Dog dog=new Dog("狗子",6,35);

        dog.bark();
    }
}
