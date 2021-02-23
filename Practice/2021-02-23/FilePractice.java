import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 目的: 练习文件读取与文件写入
 * 日期: 2021-02-23
 * 作者: ZRH
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
            printWriter.println("中国");
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