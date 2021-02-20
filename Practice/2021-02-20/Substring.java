/**
 * 目的: 学习String.substring的用法
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class Substring
{
    public static void main(String[] args)
    {
        String greeting = "Hello";
        String s1 = greeting.substring(0, 3);
        System.out.println(s1);
        String s2 = greeting.substring(1, 3);
        System.out.println(s2);
    }
}