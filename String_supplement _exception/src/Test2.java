import java.io.FileNotFoundException;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/12  11:13
 */
public class Test2 {
   public static void func(int a){
        if(a==0){
            throw new RuntimeException("a==0");//Exception in thread "main" java.lang.RuntimeException: a==0
        }
    }
    public static void func1(int a)throws CloneNotSupportedException,FileNotFoundException{
        if(a==0){
            throw new CloneNotSupportedException("a==0");//Exception in thread "main" java.lang.RuntimeException: a==0
        }
        if(a==1){
            throw new FileNotFoundException();
        }
    }
    public static void main(String[] args) {
        func(0);

    }
}
