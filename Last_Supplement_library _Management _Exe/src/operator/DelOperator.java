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
 * @date 2023/03/09  8:40
 */
public class DelOperator implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的图书的名字：");
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        int index = -1;
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                index = i;
                break;
            }
        }
        //1、i >= currentSize 没有这本书
        if (i >= currentSize) {
            System.out.println("没有这本书！");
            return;
        }
        //2、break;  说明有这本书 这本书的下标 存储在了index
        for (int j = index; j < currentSize - 1; j++) {
            //bookList[i] = bookList[i+1];
            Book book = bookList.getBook(j + 1);
            bookList.setBooks(j, book);
        }
        bookList.setBooks(currentSize - 1, null);//删除的书籍，进行了移动，最后的地方置为Null
        bookList.setUsedSize(currentSize - 1);//有效的书籍少一个
        System.out.println("删除成功！");
    }
}
