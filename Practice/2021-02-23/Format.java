/**
 * Ŀ��: ��ϰString.format������ʹ��
 * ����: 2021-02-23
 * ����: ZRH
 */
public class Format
{
    public static void main(String[] args)
    {
        String name = "ZRH";
        int age = 35;
        String message = String.format("Hello, %s.Next year, you'll be %d", name, age+1);
        System.out.println(message);
    }
}