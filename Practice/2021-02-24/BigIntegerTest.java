import java.math.*;
import java.util.*;

/**
 * 目的: 练习大数值的使用
 * 日期: 2021-02-24
 * 作者: ZRH
 */
public class BigIntegerTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = scanner.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; ++i)
        {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

        System.out.println(BigDecimal.valueOf(1, 2));
    }
}