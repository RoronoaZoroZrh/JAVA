import java.time.*;

/**
 * 目的: 练习LocalDate类
 * 日期: 2021-02-26
 * 作者: ZRH
 */
public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate lDate = LocalDate.now();
        int month = lDate.getMonthValue();
        int today = lDate.getDayOfMonth();

        lDate = lDate.minusDays(today - 1);
        DayOfWeek lWeekDay = lDate.getDayOfWeek();
        int value = lWeekDay.getValue();

        System.out.println("Mon Tus Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; ++i)
        {
            System.out.print("    ");
        }

        while (lDate.getMonthValue() == month)
        {
            System.out.printf("%3d", lDate.getDayOfMonth());
            if (lDate.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");

            lDate = lDate.plusDays(1);
            if (lDate.getDayOfWeek().getValue() == 1)
            {
                System.out.println();
            }
        }

        if (lDate.getDayOfWeek().getValue() != 1)
        {
            System.out.println();
        }
    }
}