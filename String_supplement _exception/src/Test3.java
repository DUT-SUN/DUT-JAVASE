/**
 * ��������
 * <p>
 * �������أ������ٳ�
 *
 * @author SUN
 * @date 2023/03/12  11:23
 */
public class Test3 {
    public static int func(int a) {
        try {
            if (a == 0) {
                throw new ArithmeticException();
            }
            return a;
        } catch (ArithmeticException e) {
            System.out.println("�����쳣");
        } finally {
            return 19;//finally��Ĵ��������Ƿ�����쳣����ȥִ�У�����ǰ��return

        }
    }
    public static void main(String[] args) {
        System.out.println(func(10));
        //19
    }
    //�����쳣��ʱ����벶׽���ض����쳣�������ǻύ��JVM�����������Ͳ�ִ����
    public static void main1(String[] args) {
        try {
            int[]arr=null;
            System.out.println(arr.length);
        }catch (NullPointerException e){
            System.out.println("���񵽿�ָ���쳣");
        }
        System.out.println("���������Ĵ����߼�");
    }
}
