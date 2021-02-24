import java.util.*;

/**
 * 编号: 1000
 * 题目: A + B Problem
 * 地址: http://acm.hdu.edu.cn/showproblem.php?pid=1000
 * 日期: 2021-02-24
 * 作者: ZRH
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberL;
        int numberR;
        while (scanner.hasNext())
        {
            numberL = scanner.nextInt();
            numberR = scanner.nextInt();
            System.out.println(numberL + numberR);
        }
    }
}