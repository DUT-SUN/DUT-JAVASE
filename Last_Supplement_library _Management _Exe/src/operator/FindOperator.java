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
 * @date 2023/03/09  8:41
 */
public class FindOperator implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        int currentSize=bookList.getUsedSize();
        for(int i=0;i<currentSize;i++){
             Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("找到了这本书");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要找的那本书");
    }
}
