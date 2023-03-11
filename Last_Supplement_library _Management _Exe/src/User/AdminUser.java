package User;

import Book.BookList;
import operator.*;

import java.util.Scanner;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:49
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{
                new ExitOperator(),
                new FindOperator(),
                new AddOperation(),
                new DelOperator(),
                new DisplayOperator()
        };
    }
    public int menu(){
        System.out.println("hello"+this.name+"欢迎来到图书小练习!");
        System.out.println("1.查找图书!");
        System.out.println("2.新增图书!");
        System.out.println("3.删除图书!");
        System.out.println("4.显示图书!");
        System.out.println("0.退出系统!");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }

}
