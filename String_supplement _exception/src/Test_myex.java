/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/12  18:26
 */
public class Test_myex {
    public static void func(int a) {

            if (a == 10) {
                throw new MyException("哈哈");

    }
    }
    public static void main(String[] args) {
try {func(10);}catch (MyException e){
    e.printStackTrace();
}finally {
    System.out.println("666");
}
    }
}
