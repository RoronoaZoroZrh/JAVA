import java.util.*;

/**
 * 目的: 练习for语句的使用
 * 日期: 2021-02-23
 * 作者: ZRH
 */
public class LotteryOdds
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = scanner.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
        {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ".Good luck!");
    }
}