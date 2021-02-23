/**
 * 目的: 练习String.format方法的使用
 * 日期: 2021-02-23
 * 作者: ZRH
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