import java.util.Arrays;
import java.util.Locale;

/**
 * ��������
 * <p>
 * �������أ������ٳ�
 *
 * @author SUN
 * @date 2023/03/11  14:58
 */
//�ַ����������������������һ����value����һ����hash�����������ʱ�����ô�ĵ�ַָ����е�һ�οռ䣬������value��hash����ֵ��value�еĵ�ַָ����һƬ�ռ��Ǹ���������ַ���
public class Test {
    //�ַ������ɱ�����Ϊstring��value��������Ϊprivate��������Ϊfinal�����
    public static void main(String[] args) {
final int arr[]={1,2,3};
arr[0]=2;
        System.out.println(Arrays.toString(arr));//[2, 2, 3]
        //��Ϊvalue���Բ����Ա�ֱ�ӷ���
        //final������һ��������ʱ��Ȼ�ǲ����Ըı�ֵ
        //����final������һ���ַ������ʱ������ָ��ĵ�ַ���ܸı����˼����ȫ����ͨ�������±�ȥ�ı�����ַ�����ֵ
    }
    //intern�����ǽ��ֶ�������String������ӵ���������
    public static void main12(String[] args) {
        char[]x={'h','e','l','l','o'};
        String str=new String(x);
        str.intern();//����֮�󣬻��str�����÷��볣������
        String str2="hello";
        System.out.println(str==str2);
    }
    //�ַ���������
    public static void main11(String[] args) {
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);//�����true
        String str3=new String("hello");
        String str4=new String("hello");
        System.out.println(str3==str4);//false
        char[]x={'h','e','l','l','0'};
        String str5=new String(x);
        System.out.println(str1==str5);
        //Ϊʲô����������Ľ��������C++�ĳ����ַ��������JAVA�����ڶ��д���һ����ϣ����ϣ���е�ÿ����ϣֵӳ���Ŷ���飬ÿ��������String����͹�ϣֵ��ͨ��String�����ַ�ڳ������п���ȥ�ҵ��ַ������ݺ͹�ϣֵ
        //�����յ�һ�ַ�ʽȥ������ʱ��ͨ����ϣ���ӳ��ᷢ��hello�Ѿ��ڳ������д��ڣ��������þ�ָ���˳����ص��Ǹ��ռ䣬��ַ����Ҳ��һ���ģ��������

        //�ڶ����Ƿֱ�ȥ���ٿռ����hello���������ǵ�value����ͬ��ָ�����ͬһ�����ݿռ�

        //�����ֺ͵ڶ��ֲ�࣬�������ǵ�valueָ��Ĳ���һ�����ݿռ�
    }
    //�ַ�����ȡ
    public static void main10(String[] args) {
        String str="hellohello";
        String ret=str.substring(1,4);//����1,4��һ������ҿ�������
        System.out.println(ret);
    }
    //��β��
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
        String []ret=str.split(" |&");//����ж���ָ������|�ָ�
        for (String i:
             ret) {
            System.out.println(i);
        }

    }
    //�����ַ����Ĳ����Ҫת��
    public static void main7(String[] args) {
        String str="192.0.0.1";
        String[]ret=str.split("\\.");//.��Ҫת�壬��һ��\������Ϊ\Ҳ��Ҫȥת��
        for (String i:
                ret) {
            System.out.println(i);
        }
        String str1="192\\0\\0\\1";
        String[]ret1=str1.split("\\\\");//\\�ַ���������\\˵����ת��Ϊ
        for (String i:
                ret1) {
            System.out.println(i);
        }
    }
    //�ַ������
    public static void main6(String[] args) {
        String str="hello dog cat rabbit!!";
        String[]ret=str.split(" ");
        for (String i:
             ret) {
            System.out.println(i);
        }
    }
    //�滻�ַ���
    public static void main5(String[] args) {
        String str="hellohello";
        String ret=str.replace('l','c');
        System.out.println(ret);
        ret=str.replaceAll("ll","cc");//ֻҪ����ͬ�ַ���Ҫ�滻
        System.out.println(ret);
        ret=str.replaceFirst("ll","cc");//ֻ�滻��һ���ַ���
        System.out.println(ret);
    }
    //��ʽ�����
    public static void main4(String[] args) {
        String s=String.format("%d-%d-%d",2019,9,14);
        System.out.println(s);
    }
    //�ַ���ת����
    public static void main3(String[] args) {
        String s1="hello";
        char[]chars=s1.toCharArray();
        for(char x:chars){
            System.out.println(x);
        }
        System.out.println(s1);
    }
//����ת�ַ���,�ַ���ת����
    public static void main2(String[] args) {
        String s=String.valueOf(123);
        int a=Integer.valueOf("100",2);//�ַ���ת���֣�����Ĳ����ǽ���
        System.out.println(a);
        int a2=Integer.parseInt("200");
        System.out.println(a2);
    }
    public static void main1(String[] args) {
        String str1="hello";
        String str2=new String("abcjashc");
        String str4="Hello";
        System.out.println(str1.equalsIgnoreCase(str4));//���Դ�Сд
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('l',3));
        System.out.println(str1.indexOf("llo"));
        System.out.println(str1.lastIndexOf('l',2));//�Ӻ���ǰ�ң��ڶ��������ǴӺ�����ĸ��±���ǰ��
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
