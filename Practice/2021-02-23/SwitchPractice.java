import java.util.*;

/**
 * 目的: 练习switch语句的使用
 * 日期: 2021-02-23
 * 作者: ZRH
 */
public class SwitchPractice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int i = scanner.nextInt();

        switch (i)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}