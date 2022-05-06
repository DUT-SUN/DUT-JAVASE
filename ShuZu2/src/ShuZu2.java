import java.util.Arrays;

public class ShuZu2 {
    public static String myToString(int[]arrays){
        if(arrays==null){
            return "null";
        }
        String ret="[";
for(int i=0;i<arrays.length;i++){
   ret+=arrays[i];
   if(i!=arrays.length-1){
       ret+=",";
   }

}
        ret+="]";
        return ret;
    }
    public static int[]test3(){
        int[]tmp={1,2,3,4,5};
        return tmp;
    }
    public static void main1(String[] args) {
//        int[]ret=test3();
//        System.out.println(Arrays.toString(ret));
//        int[]arr={1,2,3,4,5};
//        System.out.println(myToString(arr));
        //手动拷贝
//        int[]array={1,2,3,4,5};
//        int[]copy=new int[array.length];
//        for(int i=0;i< array.length;i++){
//            copy[i]=array[i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("_________________________");
//        System.out.println(Arrays.toString(copy));
        //更便捷的拷贝
        int[]array={1,2,3,4,5};
        int[]copy=Arrays.copyOf(array,array.length*2);//[1, 2, 3, 4, 5, 0, 0, 0, 0, 0]进行了扩容
//        假如你要拷贝一部分
        int[]copy1=Arrays.copyOfRange(array,1,3);//这个下标是左闭右开
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy1));
    }

    public static void main3(String[] args) {
//        int[]array={1,2,3,4,5};
//        int[]copy=new int[array.length];
//        System.arraycopy(array,0,copy,0,array.length);
//        //i是拷贝的数组开始位置
//        //i1是拷贝过去数组的开始位置
//        System.out.println(Arrays.toString(copy));
        int[]array2=new int[10];
        Arrays.fill(array2,99);
        System.out.println(Arrays.toString(array2));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99];

    }
    //还可以用array.clone也可以直接克隆
   //库里面的二分查找binarySearch(arr,3)返回下标
    public static void bubbleSort(int[]array){
        boolean flag=false;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void reverse(int[]array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        int[][]array={{1,2,3},{4,5,6}};
    int[][]array2=new int[2][3];
        int [][]array3=new int[][]{{1,2,3},{4,5,6}};
       for(int i=0;i<array.length;i++){
           for(int j=0;j<array[i].length;j++){
               System.out.print(array[i][j]+" ");
           }
       }
    }
}

