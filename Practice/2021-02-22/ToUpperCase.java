import java.util.Locale;

/**
 * 目的: 学习String.toUpperCase的用法
 * 日期: 2021-02-22
 * 作者: ZRH
 */
public class ToUpperCase
{
    public static void main(String[] args)
    {
        String s = "hello";
        System.out.println(s);
        System.out.println(s.toUpperCase(Locale.ROOT));
    }
}