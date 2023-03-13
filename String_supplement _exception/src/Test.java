/**
 * 功能描述
 * <p>
 * 成略在胸，良计速出
 *
 * @author SUN
 * @date 2023/03/11  19:03
 */
//结果是一样的，但是stringBuilder不会去一直产生许多中间的字符串对象（因为字符串不可以改变
    //stringBuffer是更加去着重于线程安全
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
