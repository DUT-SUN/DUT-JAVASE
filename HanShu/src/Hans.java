public class Hans {
public static int func(int a,int b){
    return a+b;
}
//函数方法名称相同 不同参数列表不同返回值相不相同无所谓都是可以的
    //参数列表相同,返回值不同不行
    //重载(overload)和重写(override)的区别是？
    public static void main(String[] args) {
        System.out.println(func(1,2));
    }
//每一个方法都有方法签名

}
