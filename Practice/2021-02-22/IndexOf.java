/**
 * Ŀ��: ѧϰString.indexOf���÷�
 * ����: 2021-02-22
 * ����: ZRH
 */
public class IndexOf
{
    public static void main(String[] args)
    {
        String s = "123abc�й�123abc�й�";
        System.out.println(s.indexOf("123"));
        System.out.println(s.indexOf("abc"));
        System.out.println(s.indexOf("�й�"));
        System.out.println(s.indexOf("123", 6));
        System.out.println(s.indexOf("abc", 6));
        System.out.println(s.indexOf("�й�", 6));
    }
}