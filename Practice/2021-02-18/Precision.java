/**
 * 目的: 查看int和float之间的转换精度问题->结果为1.23456792E8，损失了精度
 * 日期: 2021-02-18
 * 作者: ZRH
 */
public class Precision
{
    public static void main(String[] args)
    {
        int x = 123456789;
        float y = x;
        System.out.println(y);
    }
}