package Book;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/09  8:15
 */
public class Book {
    private String name;
    private String author;
    private int price;
    private  String  type;
    private boolean isBorrowed=false;

    public Book(String name, String author, int price, String type){
        this.name=name;
        this.author = author;
        this.price = price;
        this.type = type;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }


    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + (isBorrowed?"已经被借出":"未被借出") +
                '}';
    }

}
