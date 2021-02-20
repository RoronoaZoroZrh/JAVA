/**
 * 目的: 检测空串
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class EmptyString
{
    public static void main(String[] args)
    {
        String s1 = null;
        String s2 = "";
        System.out.println(s1 == null);
        System.out.println(s2.length() == 0);
    }
}