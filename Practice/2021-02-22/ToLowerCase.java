import java.util.Locale;

/**
 * 目的: 学习String.toLowerCase的用法
 * 日期: 2021-02-22
 * 作者: ZRH
 */
public class ToLowerCase
{
    public static void main(String[] args)
    {
        String s = "HELLO";
        System.out.println(s);
        System.out.println(s.toLowerCase(Locale.ROOT));
    }
}