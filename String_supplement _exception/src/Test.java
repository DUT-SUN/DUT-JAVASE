/**
 * ��������
 * <p>
 * �������أ������ٳ�
 *
 * @author SUN
 * @date 2023/03/11  19:03
 */
//�����һ���ģ�����stringBuilder����ȥһֱ��������м���ַ���������Ϊ�ַ��������Ըı�
    //stringBuffer�Ǹ���ȥ�������̰߳�ȫ
public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        System.out.println("________________");
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
    }

}
