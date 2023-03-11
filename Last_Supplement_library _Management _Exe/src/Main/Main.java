package Main;
import User.AdminUser;
import User.NormalUser;
import Book.BookList;
import User.User;

import java.util.Scanner;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:57
 */

public class Main {
    public static User Login(){
        System.out.println("请输入你的姓名:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入你的身份:1->管理员 0->普通用户");
        Scanner scanner1=new Scanner(System.in);
        int choice=scanner1.nextInt();
        if(choice==1) {
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=Login();
        while(true){
            int choice=user.menu();
            user.doIoperation(choice,bookList);
        }

    }
}
