import java.util.Scanner;
//省略
//!!!!!算二进制位1个数，和1取&然后右移,等于1 count加加，注意假如是负数补符号位是1，那么就会死循环所以
//使用无符号右移>>>
//简化算法
//n&(n-1）不为0 count就加1
public class Test {
    public static void test1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j+" ");
            }
            System.out.println();
        }
    }
    public static void test2(){
        Scanner scanner=new Scanner(System.in);
        String str="123";
        for(int i=0;i<3;i++){
            System.out.println("请输入密码");
            String str1=scanner.nextLine();
            if(str.equals(str1)){
                System.out.println("登录成功！");
                return;
            }
            else{
                System.out.println("输入密码错误请重新输入!!");
            }
        }
    }


public static void test4(){
        int a=24;
        int b=18;
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
        }
    System.out.println(b+"是最大公约数");
}
    public static void test5() {
   for(int i=1;i<999999;i++){
       int count=0;
       int tmp=i;
       while(tmp!=0){
           count++;
           tmp=tmp/10;
       }
       tmp=i;
       int sum=0;
       while(tmp!=0){
           sum+=Math.pow(tmp%10,count);
           //假如sum=sum+Math.pow()会报错，因为后面是double
           tmp/=10;
       }
       if(sum==i){
           System.out.println(sum+"是自幂数");
       }
   }
    }

    public static void test3(){
        for (int i = 0; i <= 999 ; i++) { int ge = i % 10 ;//个位数
             int shi = i /10 % 10 ;
            // 十位数
            int bai = i / 100 ;
            //百位数 //过滤 各位数的立方和=i
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) { System.out.println(i); } }
    }
    public static void main(String[] args) {
//        test1(9);
//          test2();
//test3();
test5();
    }
}
