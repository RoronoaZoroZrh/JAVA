import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Ŀ��: ��ϰ�ļ���ȡ���ļ�д��
 * ����: 2021-02-23
 * ����: ZRH
 */
public class FilePractice
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            PrintWriter printWriter = new PrintWriter("out.txt", "UTF-8");
            printWriter.println("123");
            printWriter.println("abc");
            printWriter.println("�й�");
            printWriter.flush();

            Scanner scanner = new Scanner(Paths.get("out.txt"), "UTF-8");
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}