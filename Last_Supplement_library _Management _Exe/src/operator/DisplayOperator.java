package operator;

import Book.Book;
import Book.BookList;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:40
 */
public class DisplayOperator implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
                int currentSize= bookList.getUsedSize();
        for(int i=0;i<currentSize;i++){
                System.out.println(bookList.getBook(i));

            }
        }
    }

