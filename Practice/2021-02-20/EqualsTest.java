/**
 * 目的: 查看用==运算符检测字符串是否相等->结论是在Java中不能使用==运算符检测字符串是否相等
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class EqualsTest
{
    public static void main(String[] args)
    {
        String greeting = "Hello";
        System.out.println(greeting == "Hello");
        System.out.println(greeting.substring(0, 3) == "Hel");
    }
}