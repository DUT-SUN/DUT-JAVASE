import java.util.Arrays;

public class Array {
    public static int test(int n){
if(n==1)
    return 1;
else{
    return n*test(n-1);
}
    }
    public static void test1(int n){
        if(n<10)
            System.out.println(n);
        else{
            test1(n/10);
            System.out.println((n%10));
        }
    }
    public static void main(String[] args) {
//        System.out.println(test(5));
//        test1(12312);
//
//        int[]array={1,2,3,4,5};
//        int[]array2=new int[]{1,2,3,4,5};
//        int[]array3=new int[5];
//        System.out.println("array"+array);
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//        System.out.println(" ");
//        for(int x:array){
//            System.out.print(x+" ");
//        }
//        System.out.println(" ");
//        String ret=Arrays.toString(array);
//        System.out.println(ret);
        int a=10;//main方法的栈帧放入a和b
        int b=20;
        int[]array1={1,2,3,4,5};//堆上开辟内存，放了12345
        int[]array2=new int[3];
        System.out.println(array2);
        array2=array1;
        System.out.println(array2);
        //[I@16b98e56
        //[I@7ef20235赋值就是换了地址
        for(int x:array2){
            System.out.print(x+" ");
        }
        //在main栈帧里存了引用变量array，array里有这个数组的地址
    }
    //        array[I@7b23ec81
    //！！！！！！！当你把数组传给一个函数的时候，形参存的那个数组的地址就是你传的数组的地址，当你在函数赋值的时候，
    //比如array=new int[]{1,2,3},其实这个新创建的地址是赋值给了形参，实参地址不变，
    //但是在函数中用形参访问元素改变值实际也改变了，因为指向同一块地址
//        这个方括号是数组的意思I是整形，后面是地址的哈希值理解为地址
    //new关键字是创建了一个对象，前面的array是引用变量存储了对象的地址
    //JVM有五块内存的简单布局
    // Java虚拟机栈（每个方法执行时，都会创建一个栈帧），
    // 本地方法栈（native方法C和C++），
    // 堆（JVM管理的最大的内存区域），
    // 方法区（主要存储类信息），
    // 程序计数器（很小的空间，存储下一条指令的地址)


}
