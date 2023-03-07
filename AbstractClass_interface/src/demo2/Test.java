package demo2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/07  23:36
 */
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class NameComparator implements  Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {
    public static void main(String[] args) {
        Student[]students=new Student[3];
        students[0]=new Student("abc",12,47.2);
        students[1] =new Student("bit",2,48.3);
        students[2] =new Student("npk",10,420.2);
        System.out.println("排序前"+Arrays.toString(students));
//        Arrays.sort(students,new AgeComparator());
        Arrays.sort(students,new NameComparator());
        System.out.println("排序后"+Arrays.toString(students));
    }
    public static void main1(String[] args) {
        Student student1=new Student("abc",12,47.2);
        Student student2=new Student("bit",2,48.3);
        if(student1.compareTo(student2)>0){
            System.out.println("1号年龄大");
        } else if (student1.compareTo(student2)==0) {
            System.out.println("一样大");
        }else{
            System.out.println("2号年龄大");
        }

    }

}
