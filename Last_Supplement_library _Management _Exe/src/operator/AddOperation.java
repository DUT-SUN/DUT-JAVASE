package operator;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:37
 */
public class AddOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要添加的书名");
        String name=scanner.nextLine();
        System.out.println("请输入你要添加的书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入你要添加的书的价格");
        int price=scanner.nextInt();
        System.out.println("请输入你要添加的书的类别");
        String type=scanner.nextLine();
        Book book=new Book(name,author,price,type);
        int cur=bookList.getUsedSize();
        bookList.setBooks(cur,book);
        bookList.setUsedSize(cur+1);
        System.out.println("新增书籍成功");
    }
}
