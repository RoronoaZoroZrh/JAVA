/**
 * 目的: 学习String.startsWith的用法
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class StartsWith
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Hel";
        String s3 = "Tel";
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
    }
}