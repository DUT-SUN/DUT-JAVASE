package operator;

import Book.BookList;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:41
 */
public class ExitOperator implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("保存退出");
        System.exit(0);
    }
}
