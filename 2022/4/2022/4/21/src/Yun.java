import java.util.Scanner;

public class Yun {
    public static void main(String[]args)
    {
       /* System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");//顺序结构*/
        Scanner scanner=new Scanner(System.in);//前面引入Scannner包
        int n=scanner.nextInt();//读入整数
        if(n%2==0)
        {
            System.out.println("它是一个偶数");
        }
        else
        {
            System.out.println("它是一个奇数");
        }


    }
    public static void main1(String[]args)
    {
 /*       System.out.println(5/2);
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
        2
        1
        1
       -1
       -1
       */
        System.out.println(10.5%3);//1.Java可以对浮点数求余数

        short a=1;
//        a=a+1;
    //2.会报错 a+1变成了整形需要强转
        a+=1;//不会报错，+=会自动转化
        int c=1,d=1;
        System.out.println(c==d);//为什么代码里面是黄色的，是编译器给的警告
        System.out.println(true&&false);
        System.out.println(false&&(20/0)==0);//只要前面假后面不执行也就不报错
//        System.out.println(true&&(20/0)==0);//这样就会报错，有一说一挺好玩，可以当catch用
        float h=0;
        System.out.println(1/h);//Infinity测试结果如下（探索出的)
        System.out.println(h==0);//但是还是true,右面0进行整形强转还是true
        System.out.println(-1>>1);
        System.out.println(-1>>>1);//无符号右移
        //没有无符号左移，因为右面没有符号位
        //左移乘2右移除2
boolean flg=false?false:true==true?true:false;//true
System.out.println(flg);
        System.out.println(true?1:2.0);//这个1整形提升了
        //逻辑控制

    }
}
