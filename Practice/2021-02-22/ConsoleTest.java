import java.io.*;

/**
 * 目的: 学习Console类->通过IDE获得的cons是null
 * 日期: 2021-02-22
 * 作者: ZRH
 */
public class ConsoleTest
{
    public static void main(String[] args)
    {
        Console cons = System.console();
        String userName = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");

        System.out.println(userName);
        System.out.println(passwd);
    }
}