import java.time.*;

/**
 * 目的: 练习LocalDate类
 * 日期: 2021-02-26
 * 作者: ZRH
 */
public class LocalDateTest
{
    public static void main(String[] args)
    {
        LocalDate lDate1 = LocalDate.now();
        System.out.println(lDate1.getYear());
        System.out.println(lDate1.getMonthValue());
        System.out.println(lDate1.getDayOfMonth());

        LocalDate lDate2 = LocalDate.of(1999, 12, 31);
        System.out.println(lDate2.getYear());
        System.out.println(lDate2.getMonthValue());
        System.out.println(lDate2.getDayOfMonth());

        LocalDate lDate3 = lDate2.plusDays(1000);
        System.out.println(lDate3.getYear());
        System.out.println(lDate3.getMonthValue());
        System.out.println(lDate3.getDayOfMonth());
    }
}