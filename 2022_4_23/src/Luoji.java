import java.util.Random;
import java.util.Scanner;
public class Luoji {
    public static int add(int a,int b){
        return a+b;
    }
public static int fac(int n){
        int ret=1;
        for(int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
}
public static int facSum(int k){
        int sum=0;
        for(int i=1;i<=k;i++){
            sum+=fac(i);
        }
        return sum;
}

    public static void main(String[] args) {
        System.out.println(facSum(5));
    }
    public static void main10(String[]args){
        int ret=add(1,2);
        System.out.println(ret);
    }
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(1);//这个里面给了值就是给定时间戳就是确切的值
        int randNum = random.nextInt(101);//这里面写101就是边界生成0到100的数包括100
//        int rand=(int)Math.random();
        while (true) {
            int count = 3;
            while (count != 0) {
                System.out.println("请输入猜的数字");
                int num = scanner.nextInt();
                if (num < randNum) {
                    System.out.println("猜小了");
                }
                else if(num>randNum){
                    System.out.println("猜大了");
                }
                else{
                    System.out.println("猜对了");
                    return;
                }
            }
        }
    }
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String str=scanner.nextLine();//这个可以读取空格
//        String str=scanner.next();//这个不能读取空格
        System.out.println(str);
        System.out.println("请输入你的年龄:");
        int age=scanner.nextInt();//这个可以读取空格
        System.out.println(age);
    }
    public static void main7(String[] args) {

    }
    public static void main6(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0)
            {
                System.out.println(i);
            }
            continue;
        }
    }
    public static void main5(String[] args) {
        int i=5;
        int sum=1;
        while(i!=0)
        {
            sum*=i;
            i--;
        }
        System.out.println(sum);
    }
    public static void main4(String[] args) {
        int sum1=0,sum2=0,sum=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                sum2+=i;
            }
            else
            {
                sum1+=i;
            }
        }
        sum=sum1+sum2;
        System.out.println("奇数和"+sum1);
        System.out.println("偶数和"+sum2);
        System.out.println("总和"+sum);
    }
    public static void main3(String[]args)
    {
        int i=1;
        while(i++<10)
        {
            System.out.println(i);
        }
    }
    public static void main2(String[]args){
        int a=1;
        switch(a)
        {
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("其他");
        }
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
//        处理循环输入
        while (scan.hasNextInt()) {
            int year = scan.nextInt();
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("它是闰年");
                } else {
                    System.out.println("它不是闰年");
                }
            } else {
                if (year % 4 == 0) {
                    System.out.println("它是闰年");
                } else {
                    System.out.println("它不是闰年");
                }
            }
        }
    }
}