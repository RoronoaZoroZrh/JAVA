import java.io.*;

/**
 * Ŀ��: ѧϰConsole��->ͨ��IDE��õ�cons��null
 * ����: 2021-02-22
 * ����: ZRH
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