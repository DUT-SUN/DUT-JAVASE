package User;

import Book.BookList;
import operator.IOperation;

import java.util.Scanner;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:49
 */
public abstract class User {
    protected String name;
    protected IOperation[]iOperations;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
public  void doIoperation(int choice , BookList bookList)
{
    this.iOperations[choice].work(bookList);
};
}
