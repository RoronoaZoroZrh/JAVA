/**
 * 目的: 学习String.indexOf的用法
 * 日期: 2021-02-22
 * 作者: ZRH
 */
public class IndexOf
{
    public static void main(String[] args)
    {
        String s = "123abc中国123abc中国";
        System.out.println(s.indexOf("123"));
        System.out.println(s.indexOf("abc"));
        System.out.println(s.indexOf("中国"));
        System.out.println(s.indexOf("123", 6));
        System.out.println(s.indexOf("abc", 6));
        System.out.println(s.indexOf("中国", 6));
    }
}