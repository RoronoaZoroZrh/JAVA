/**
 * 目的: 练习格式化输出double类型
 * 日期: 2021-02-23
 * 作者: ZRH
 */
public class DoubleOutput
{
    public static void main(String[] args)
    {
        double x = -10000.0 / 3;
        System.out.println(x);
        System.out.printf("%.2f", x);
        System.out.println();
        System.out.printf("%-10.2f", x);
        System.out.println();
        System.out.printf("%,.2f", x);
        System.out.println();
        System.out.printf("%,+(.2f", x);
        System.out.println();
        System.out.println();

        System.out.printf("%+.2f", 1000f);
        System.out.println();
        System.out.printf("%+.2f", -1000f);
        System.out.println();
        System.out.println();

        System.out.printf("% .2f", 1000f);
        System.out.println();
        System.out.printf("% .2f", -1000f);
        System.out.println();
        System.out.println();

        System.out.printf("% 010.2f", -1000f);
        System.out.println();
        System.out.println();

        System.out.printf("% 10.2f", -1000f);
        System.out.println();
        System.out.printf("% -10.2f", -1000f);
        System.out.println();
        System.out.println();

        System.out.printf("% (10.2f", -1000f);
        System.out.println();
        System.out.printf("% (-10.2f", -1000f);
        System.out.println();
        System.out.println();

        System.out.printf("% ,(#10.2f", -1000f);
        System.out.println();
        System.out.printf("% ,(#-10.2f", -1000f);
        System.out.println();
        System.out.println();

        System.out.printf("%1$d %1$x", 159);
        System.out.println();
        System.out.println();

        System.out.printf("%d %<x", 159);
        System.out.println();
        System.out.println();
    }
}