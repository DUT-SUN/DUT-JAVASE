/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/12  11:23
 */
public class Test3 {
    public static int func(int a) {
        try {
            if (a == 0) {
                throw new ArithmeticException();
            }
            return a;
        } catch (ArithmeticException e) {
            System.out.println("算数异常");
        } finally {
            return 19;//finally里的代码无论是否出现异常都会去执行，就算前面return

        }
    }
    public static void main(String[] args) {
        System.out.println(func(10));
        //19
    }
    //捕获异常的时候必须捕捉到特定的异常，否则还是会交给JVM处理，后面程序就不执行了
    public static void main1(String[] args) {
        try {
            int[]arr=null;
            System.out.println(arr.length);
        }catch (NullPointerException e){
            System.out.println("捕获到空指针异常");
        }
        System.out.println("我是其他的代码逻辑");
    }
}
