import java.util.Date;

/**
 * 目的: 练习格式化输出Date类型
 * 日期: 2021-02-23
 * 作者: ZRH
 */
public class DateOutput
{
    public static void main(String[] args)
    {
        Date date = new Date();

        System.out.printf("%tc", date);
        System.out.println();
        System.out.printf("%tF", date);
        System.out.println();
        System.out.printf("%tD", date);
        System.out.println();
        System.out.printf("%tT", date);
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due Date:", date);
        System.out.println();
        System.out.printf("%1$s %2$tB %<te, %<tY", "Due Date:", date);
        System.out.println();
    }
}