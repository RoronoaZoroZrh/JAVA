import java.util.*;

/**
 * Ŀ��: ѧϰScanner��
 * ����: 2021-02-22
 * ����: ZRH
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + ".Next year, you'll be " + (age + 1));
    }
}