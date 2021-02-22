/**
 * 目的: 学习String.endsWith的用法
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class EndsWith
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "llo";
        String s3 = "llO";
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
    }
}