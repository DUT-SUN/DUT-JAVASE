class WashMachine{
    public double number;
//编译器快捷键：alt+insert然后选择constr的那个构造然后自动构造
    public WashMachine(double number) {
        this.number = number;
    }
    WashMachine(){
        this(2);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
//对象new实例化的时候，引用类型为null
//数字的为0.boolean是false
public class Project {
    public static void main1(String[] args) {
int[][]arr={{1,2,3,4,5},{2,3,4,5,6}};
        for (int[]tmp:arr)
        {
            for(int x:tmp){
                System.out.print(x+" ");
            }
        }
        int[][]array=new int[2][];
        array[0]=new int[3];
        array[1]=new int[5];
    }

    public static void main(String[] args) {
        int[]arr={3,4,7,2,5,6,2,1,0,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }

}
