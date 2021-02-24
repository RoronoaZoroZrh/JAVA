import java.util.*;

/**
 * 目的: 学习数组的使用
 * 日期: 2021-02-24
 * 作者: ZRH
 */
public class LotteryDrawing
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = scanner.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; ++i)
        {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; ++i)
        {
            int r = (int)(Math.random() * n);

            //System.out.println(n);

            result[i] = numbers[r];

            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("Bet the following combination.It'll make you rich.");
        for (int r : result)
        {
            System.out.println(r);
        }
    }
}