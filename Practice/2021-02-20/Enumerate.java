/**
 * 目的: 学习枚举类型
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class Enumerate
{
    enum Size
    {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE
    };

    public static void main(String[] args)
    {
        Size s = Size.LARGE;
        System.out.println(s);
        System.out.println(Size.LARGE);
    }
}