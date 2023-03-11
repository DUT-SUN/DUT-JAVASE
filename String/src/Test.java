import java.util.Arrays;
import java.util.Locale;

/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/11  14:58
 */
//字符串构造出来是有两个属性一个是value还有一个是hash，当它构造的时候，引用存的地址指向堆中的一段空间，里面有value和hash两个值，value中的地址指向另一片空间那个里面存在字符串
public class Test {
    //字符串不可变是因为string的value属性是因为private而不是因为final引起的
    public static void main(String[] args) {
final int arr[]={1,2,3};
arr[0]=2;
        System.out.println(Arrays.toString(arr));//[2, 2, 3]
        //因为value属性不可以被直接访问
        //final作用于一个变量的时候当然是不可以改变值
        //但是final作用于一个字符数组的时候，是所指向的地址不能改变的意思，完全可以通过访问下标去改变这个字符串的值
    }
    //intern方法是将手动创建的String对象添加到常量池中
    public static void main12(String[] args) {
        char[]x={'h','e','l','l','o'};
        String str=new String(x);
        str.intern();//调用之后，会把str的引用放入常量池中
        String str2="hello";
        System.out.println(str==str2);
    }
    //字符串常量池
    public static void main11(String[] args) {
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);//这个是true
        String str3=new String("hello");
        String str4=new String("hello");
        System.out.println(str3==str4);//false
        char[]x={'h','e','l','l','0'};
        String str5=new String(x);
        System.out.println(str1==str5);
        //为什么会出现这样的结果类似于C++的常量字符串，这个JAVA中是在堆中存有一个哈希表，哈希表中的每个哈希值映射着多个块，每个块中有String对象和哈希值，通过String对象地址在常量池中可以去找到字符串数据和哈希值
        //当按照第一种方式去创建的时候，通过哈希表的映射会发现hello已经在常量池中存在，所以引用就指向了常量池的那个空间，地址所以也是一样的，所以相等

        //第二种是分别去开辟空间存了hello，不过他们的value是相同的指向的是同一块数据空间

        //第三种和第二种差不多，但是他们的value指向的不是一块数据空间
    }
    //字符串截取
    public static void main10(String[] args) {
        String str="hellohello";
        String ret=str.substring(1,4);//给的1,4是一个左闭右开的区间
        System.out.println(ret);
    }
    //多次拆分
    public static void main9(String[] args) {
        String str="name=zhangsan&age=10";
        String[]ret=str.split("&");
        for(int i=0;i<ret.length;i++){
            String[]temp=ret[i].split("=");
            System.out.println(temp[0]+"="+temp[1]);
        }
    }
    public static void main8(String[] args) {
        String str="105 JAVA zhang&san";
        String []ret=str.split(" |&");//如果有多个分割符，用|分隔
        for (String i:
             ret) {
            System.out.println(i);
        }

    }
    //特殊字符串的拆分需要转义
    public static void main7(String[] args) {
        String str="192.0.0.1";
        String[]ret=str.split("\\.");//.需要转义，加一个\不行因为\也需要去转义
        for (String i:
                ret) {
            System.out.println(i);
        }
        String str1="192\\0\\0\\1";
        String[]ret1=str1.split("\\\\");//\\字符串中两个\\说明是转义为
        for (String i:
                ret1) {
            System.out.println(i);
        }
    }
    //字符串拆分
    public static void main6(String[] args) {
        String str="hello dog cat rabbit!!";
        String[]ret=str.split(" ");
        for (String i:
             ret) {
            System.out.println(i);
        }
    }
    //替换字符串
    public static void main5(String[] args) {
        String str="hellohello";
        String ret=str.replace('l','c');
        System.out.println(ret);
        ret=str.replaceAll("ll","cc");//只要是相同字符都要替换
        System.out.println(ret);
        ret=str.replaceFirst("ll","cc");//只替换第一个字符串
        System.out.println(ret);
    }
    //格式化输出
    public static void main4(String[] args) {
        String s=String.format("%d-%d-%d",2019,9,14);
        System.out.println(s);
    }
    //字符串转数组
    public static void main3(String[] args) {
        String s1="hello";
        char[]chars=s1.toCharArray();
        for(char x:chars){
            System.out.println(x);
        }
        System.out.println(s1);
    }
//数字转字符串,字符串转数字
    public static void main2(String[] args) {
        String s=String.valueOf(123);
        int a=Integer.valueOf("100",2);//字符串转数字，后面的参数是进制
        System.out.println(a);
        int a2=Integer.parseInt("200");
        System.out.println(a2);
    }
    public static void main1(String[] args) {
        String str1="hello";
        String str2=new String("abcjashc");
        String str4="Hello";
        System.out.println(str1.equalsIgnoreCase(str4));//忽略大小写
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('l',3));
        System.out.println(str1.indexOf("llo"));
        System.out.println(str1.lastIndexOf('l',2));//从后往前找，第二个参数是从后面的哪个下标往前找
        char[]x={'a','b','c'};
        String str3=new String(x);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
       str3=str3.toUpperCase(Locale.ROOT);
        System.out.println(str3);
        System.out.println(x);
    }
}
