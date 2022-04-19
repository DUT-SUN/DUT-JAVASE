import java.util.Locale;

/**
 * 整形:
 * 1.4个字节【可移植性强】不管32位还是64位都是4个字节
 * 2.int没有无符号整数的，所以int既能表示正数也能表示负数
 * 第一位是符号位后31位为数值位
 * 长整形:
 * 8个字节 63位
 * -2^63~2^63-1
 *短整形:
 * 2个字节
 * 字节:
 * 1个字节
 * 不能直接赋值一个超过这个范围的值不然会报错可以进行强制类型转换
 *  integer是int的plus版本
 */
public class Shuju {
    public static void main(String[]args)
    {
        int a=10;
        long b=10L;
        short c=127;
        byte d=(byte)(c+1);
        float e=12.5f;
        double f=19.9;
        int a1=1;
        int a2=2;
        //float精度-6位
        double num=1.1;
        char  m='孙';
        char n='c';//字符型两个字节0~65535使用的是unicode字符集 原来c的只能表示英文相关的
        boolean x=false;//boolean类型没有明确大小
  /*      JAVA里面没有0是假非0是真
        java的真和假只有true和false
        ctrl+shift+/注释再一次取消注释
        ctrl +/是行注释上面是块注释
        字符编码:GBK,UTF-8*/
        byte b1=1;
        byte b2=2;
//        byte b3=b1+b2;会报错，所有小于四个字节运算的时候会先提升为4个字节然后参与运算所以int转byte会报错
        int i=10;
        float f1=19.9f;
//        i=f1; 会报错因为float和int虽然都是小数部分，但是
        char ch=97;
        char ch2=97+2;//这不会报错，Java只会检查是否超过范围
        String str="  avasdaabsda  ";
//char ch2=ch+2;会报错因为进行了运算整形提升
        //两种不一样的数据类型进行运算的时候，会把较小的转化的较大的一个参于运算
        System.out.println(num*num);//精度
        System.out.println((double)a1/a2);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(m);
        System.out.println(n);
        System.out.println("整形最大值:" + Integer.MAX_VALUE);
        System.out.println("整形最小值:" + Integer.MIN_VALUE);
        System.out.println("长整形最大值:" + Long.MAX_VALUE);
        System.out.println("长整形最小值:" + Long.MIN_VALUE);
        System.out.println("短整形最大值:" + Short.MIN_VALUE);
        System.out.println("短整形最小值:" + Short.MIN_VALUE);
        System.out.println("比特最大值:" + Byte.MAX_VALUE);
        System.out.println("比特最小值:" + Byte.MIN_VALUE);

        System.out.println(str.length());
        System.out.println(str.toUpperCase());//变大写输出
        System.out.println(str.trim());//去空格
//        System.out.println(str.replace(target:"ab",replacement:"pp"));//
/*    int ax=Integer.parseInt(str);
    System.out.println(ax);这个是字符串转整数*/
        //str.reverse()转置
        int an=10;
        int bn=20;
        System.out.println("a="+a+",b="+b);//字符串后面跟加号进行拼接
    }
}
