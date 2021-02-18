/**
 * 目的: 了解数学库中round函数的使用方式
 * 日期: 2021-02-18
 * 作者: ZRH
 */
public class MathRound
{
    public static void main(String[] args)
    {
        double x = 9.997;
        int y = (int)x;
        System.out.println(y);
        int z = (int)Math.round(x);
        System.out.println(z);
    }
}