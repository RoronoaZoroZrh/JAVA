/**
 * 目的: 学习按位与运算
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class BitAnd
{
    public static void main(String[] args)
    {
        int n = 24;
        int m = (n & 1 << 3) >> 3;
        System.out.println(m);
    }
}