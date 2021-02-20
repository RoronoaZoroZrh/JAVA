/**
 * 目的: 学习按位运算，右操作数会做模运算
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class BitOp
{
    public static void main(String[] args)
    {
        System.out.println(1 << 3);
        System.out.println(1 << 35); //模32
        System.out.println(1L << 4);
        System.out.println(1L << 36);
        System.out.println(1L << 68); //模64
    }
}