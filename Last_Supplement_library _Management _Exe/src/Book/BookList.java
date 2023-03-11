package Book;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:21
 */
public class BookList {
    private Book[]books=new Book[10];
    private int usedSize;

    public BookList() {
        books[0]=new Book("三国","罗贯中",19,"小说");
        books[1]=new Book("阿衰","不知道",13,"漫画");
        books[2]=new Book("红楼梦","曹雪芹",23,"小说");
        usedSize=3;
    }
    public Book getBook(int pos){
        return books[pos];
    }
    public void setBooks(int pos,Book book){
        books[pos]=book;
    }
    public void setUsedSize(int size){
        usedSize=size;
    }



    public int getUsedSize() {
        return usedSize;
    }
}
