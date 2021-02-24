import java.util.*;

/**
 * 目的: 学习多维数组的使用
 * 日期: 2021-02-24
 * 作者: ZRH
 */
public class CompoundInterest
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; ++j)
        {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];
        Arrays.fill(balances[0], 10000);

        for (int i = 1; i < balances.length; ++i)
        {
            for (int j = 0; j < balances[i].length; ++j)
            {
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        for (double v : interestRate) {
            System.out.printf("%9.0f%%", 100 * v);
        }
        System.out.println();

        //System.out.println(Arrays.deepToString(balances));

        for (double[] row : balances)
        {
            for (double b : row)
            {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}