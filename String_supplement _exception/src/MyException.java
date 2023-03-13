/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/12  18:24
 */
public class MyException extends RuntimeException{
    public MyException(){}
    MyException(String message){
        super(message);
    }
}
